package com.coderulagam.spring_security_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSecurityDemoApplication {
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to GitHub Cicd-Actions";
	}

//	echo "# Practise-progms" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/suniljsk/Practise-progms.git
//	git push -u origin main
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDemoApplication.class, args);
	}

}
