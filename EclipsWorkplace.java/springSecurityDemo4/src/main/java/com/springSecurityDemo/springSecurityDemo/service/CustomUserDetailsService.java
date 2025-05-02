package com.springSecurityDemo.springSecurityDemo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.springSecurityDemo.springSecurityDemo.model.Student;
import com.springSecurityDemo.springSecurityDemo.repository.Studentrepo;

public class CustomUserDetailsService implements UserDetailsService {
	private Studentrepo studentRepo;

	public CustomUserDetailsService(Studentrepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("student1: "+username);
		Student student = studentRepo.findByEmail(username)
				.orElseThrow(() -> new UsernameNotFoundException("username not found: " + username));
		System.out.println("student: " + student);
		return new CustomUserDetails(student);
	}

}
