package com.FormValidation.FormValidation.service;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.FormValidation.FormValidation.dto.StudentDTO;
import com.FormValidation.FormValidation.model.Student;
import com.FormValidation.FormValidation.repository.StudentRepository;
@Service
public class StudentService {
	private StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	public List<Student> getAllstudents() {
		return studentRepository.findAll();
	}
	
	public void saveStudent(StudentDTO studentDTO) {
		MultipartFile image = studentDTO.getImage();
		MultipartFile resume = studentDTO.getResume();
		Date createdAt = new Date();
		String storeImageName = createdAt.getTime()+"_"+image.getOriginalFilename();

		String storeResumeName = createdAt.getTime()+"_"+resume.getOriginalFilename();
		System.out.println(storeImageName);
		
		try {
			String uploadDir = "public/images/";
			String uploadDirr = "public/resume/";
			Path uploadPath = Paths.get(uploadDir);
			Path uploadPath1 = Paths.get(uploadDirr);
			if(!Files.exists(uploadPath)) {
				Files.createDirectories(uploadPath);
			}
			try {
				InputStream inputStream = image.getInputStream();
				Files.copy(inputStream,Paths.get(uploadDir+storeImageName),StandardCopyOption.REPLACE_EXISTING);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//document
		
//		  if (document != null && !document.isEmpty()) {
//		        try {
//		            String storeDocumentName = createdAt.getTime() + "_" + document.getOriginalFilename();
//		            String docUploadDir = "public/documents/";
//		            Path docUploadPath = Paths.get(docUploadDir);
//		            if (!Files.exists(docUploadPath)) {
//		                Files.createDirectories(docUploadPath);
//		            }
//		            InputStream inputStream = document.getInputStream();
//		            Files.copy(inputStream, Paths.get(docUploadDir + storeDocumentName), StandardCopyOption.REPLACE_EXISTING);
//		        } catch (Exception e) {
//		            System.out.println("Document upload error: " + e.getMessage());
//		        }
//		    }
		

		Student student = new Student();
		student.setName(studentDTO.getName());
		student.setAge(studentDTO.getAge());
		student.setEmail(studentDTO.getEmail());
		student.setPassword(studentDTO.getPassword());
		student.setImagePath(storeImageName);
		student.setResumePath(storeResumeName);
		studentRepository.save(student);
	}

	public void deleteStudent(Long id) {
		Student student = studentRepository.findById(id).get();
		//What is the image path of the student
		String uploadDir = "public/images/";
		String uploadDir1 = "public/resume/";
		Path resumePath = Paths.get(uploadDir+student.getImagePath());
		Path imagePath = Paths.get(uploadDir1+student.getResumePath());
		try {
			Files.delete(imagePath);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		studentRepository.delete(student);
	}
	public StudentDTO editStudent(Long id) {
		Student student = studentRepository.findById(id).get();
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setName(student.getName());
		studentDTO.setAge(student.getAge());
		studentDTO.setEmail(student.getEmail());
		studentDTO.setPassword(student.getPassword());
		return studentDTO;
	}
	public void updateStudent(StudentDTO studentDTO, Long id) {
		Student student = studentRepository.findById(id).get();
		if(!studentDTO.getImage().isEmpty()) {
			Path oldImagePath = Paths.get("public/images/"+student.getImagePath());
			try {
				Files.delete(oldImagePath);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			MultipartFile image = studentDTO.getImage();
			Date createdAt = new Date();
			String storeImageName = createdAt.getTime()+"_"+image.getOriginalFilename();
			String uploadDir = "public/images/";
			try {
					InputStream inputStream = image.getInputStream();
					Files.copy(inputStream,Paths.get(uploadDir+storeImageName),StandardCopyOption.REPLACE_EXISTING);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			student.setImagePath(storeImageName);
		}
		
		if(!studentDTO.getResume().isEmpty()) {
			Path oldResumePath = Paths.get("public/resume/"+student.getResumePath());
			try {
				Files.delete(oldResumePath);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			MultipartFile resume = studentDTO.getResume();
			Date createdAt = new Date();
			String storeResumeName = createdAt.getTime()+"_"+resume.getOriginalFilename();
			String uploadDir1 = "public/resume/";
			try {
				InputStream inputStream = resume.getInputStream();
				Files.copy(inputStream, Paths.get(uploadDir1+storeResumeName), StandardCopyOption.REPLACE_EXISTING);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			student.setResumePath(storeResumeName);
		}

		student.setName(studentDTO.getName());
		student.setAge(studentDTO.getAge());
		student.setEmail(studentDTO.getEmail());
		student.setPassword(studentDTO.getPassword());
		studentRepository.save(student);
	}

}
