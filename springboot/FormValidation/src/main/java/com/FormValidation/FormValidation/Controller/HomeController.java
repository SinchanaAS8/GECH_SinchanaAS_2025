package com.FormValidation.FormValidation.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.FormValidation.FormValidation.dto.StudentDTO;
import com.FormValidation.FormValidation.model.Student;
import com.FormValidation.FormValidation.repository.StudentRepository;
import com.FormValidation.FormValidation.service.StudentService;

import jakarta.validation.Valid;
//import org.springframework.web.bind.annotation.RestController;


@Controller
public class HomeController {
	
	private final StudentService studentService;
	private final StudentRepository studentRepository;
	// Constructor Injection
	@Autowired
	
//	public HomeController(StudentService studentService) {
//		super();
//		this.studentService = studentService;
//	}
	public HomeController(StudentService studentService, StudentRepository studentRepository) {
		super();
		this.studentService = studentService;
		this.studentRepository = studentRepository;
	}
	
	@GetMapping("/add-student")
	public String addStudent(Model model) {
		model.addAttribute("studentDTO", new StudentDTO());
		return "add_student";
	}
	
	
	@GetMapping("/")
	public String listStudents(Model model) {
	    List<Student> students = studentService.getAllstudents();
	    students.stream().forEach(s->System.out.println(s));
	    model.addAttribute("students", students);
	    return "home";
	}

		
	@PostMapping("/add-student")
	public String showaddStudent(@Valid @ModelAttribute StudentDTO studentDTO, BindingResult result, Model model, RedirectAttributes attributes) {
		Student student = studentRepository.findByEmail(studentDTO.getEmail());
		if(student != null) {
			result.addError(new FieldError("studentDTO", "email", "Email is already exist"));
		}
		if(studentDTO.getImage().isEmpty()) {
			result.addError(new FieldError("studentDTO", "image", "Image is required"));
		}
		if(studentDTO.getResume().isEmpty()) {
        	result.addError(new FieldError("StudentDTO", "resume", "resume is required"));
        }
		if(result.hasErrors()) {
			return "add_student";
		}
		System.out.println(studentDTO.getName()+"2");
		studentService.saveStudent(studentDTO);
		attributes.addFlashAttribute("success", "Student added successfuly");
		return "redirect:/";	
	}
	@GetMapping("/std-delete")
	public String deleteStudent(@RequestParam Long id, RedirectAttributes attributes) {
		studentService.deleteStudent(id);
		attributes.addFlashAttribute("success", "Student deleted successfuly");
		return "redirect:/";
	}
	@GetMapping("/std-edit")
	public String editStudent(@RequestParam Long id, Model model) {
		StudentDTO studentDTO = studentService.editStudent(id);
		Student student = studentRepository.findById(id).get();
		model.addAttribute("studentDTO", studentDTO);
		model.addAttribute("student", student);
		return "edit_student";
	}
	
	@PostMapping("/edit-student")
	public String updateStudent(@Valid @ModelAttribute StudentDTO studentDTO,BindingResult result,@RequestParam Long id,Model model ) {
		Student student1 = studentRepository.findByEmail(studentDTO.getEmail());
		if(student1 != null && student1.getId()!=id) {
			result.addError(new FieldError("studentDTO", "email", "Email is already exist"));
		}
		if(result.hasErrors()) {
			Student student=studentRepository.findById(id).get();
			 model.addAttribute("student",student);
			return "edit_student";
		}
		studentService.updateStudent(studentDTO,id);
	 return "redirect:/";

    }
}
