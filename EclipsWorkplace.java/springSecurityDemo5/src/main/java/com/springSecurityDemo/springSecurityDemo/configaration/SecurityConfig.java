package com.springSecurityDemo.springSecurityDemo.configaration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.springSecurityDemo.springSecurityDemo.repository.Studentrepo;
import com.springSecurityDemo.springSecurityDemo.service.CustomUserDetailsService;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {
	private Studentrepo studentRepo;

	public SecurityConfig(Studentrepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailService() {
		return new CustomUserDetailsService(studentRepo);
	} 
	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider() {
		 DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		 provider.setPasswordEncoder(passwordEncoder());
		 provider.setUserDetailsService(userDetailService());
		 return provider;
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http
				.authorizeHttpRequests(auth-> auth
						.requestMatchers("/","/about","/contact","/register").permitAll()
						.anyRequest().authenticated()
						)
				.formLogin(login -> login
						.loginPage("/login")
						.loginProcessingUrl("/login")
						.defaultSuccessUrl("/std_details",true)
						.permitAll()
						)
				.logout(logout->logout
						.logoutSuccessUrl("/login?logout")
						.permitAll())
				.build();
				
	   }
}
				

