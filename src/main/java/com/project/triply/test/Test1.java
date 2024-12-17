package com.project.triply.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@Controller
public class Test1 {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
