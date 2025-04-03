package com.FormValidation.FormValidation.service;

import org.springframework.stereotype.Service;

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
	
	public void saveStudent(StudentDTO studentDTO) {
		Student student = new Student();
		student.setName(studentDTO.getName());
		student.setAge(studentDTO.getAge());
		student.setEmail(studentDTO.getEmail());
		student.setPassword(studentDTO.getPassword());
		studentRepository.save(student);
	}
}
