package com.FormValidation.FormValidation.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.FormValidation.FormValidation.dto.StudentDTO;
import com.FormValidation.FormValidation.service.StudentService;

import jakarta.validation.Valid;
//import org.springframework.web.bind.annotation.RestController;


@Controller
public class HomeController {
	
	private final StudentService studentService;
	// Constructor Injection
	@Autowired
	public HomeController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	

	@GetMapping({"","/"})
	public String home() {
		return "home";
	}
	
	@GetMapping("/add-student")
	public String add_student(Model model) {
		model.addAttribute("studentDTO", new StudentDTO());
		return "add_student";
	}
		
	@PostMapping("/add-student")
	public String add_student(@Valid @ModelAttribute StudentDTO studentDTO, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "add_student";
		}
		System.out.println(studentDTO.getName());
		studentService.saveStudent(studentDTO);
		return "redirect:/";

		
	}


}
