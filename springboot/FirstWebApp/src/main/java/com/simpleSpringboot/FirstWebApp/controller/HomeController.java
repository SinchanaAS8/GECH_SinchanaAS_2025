package com.simpleSpringboot.FirstWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping
	public String home() {
		return "home";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
