package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ram-test")
public class Ram {
	
	
	@GetMapping
	public String RamTest() {
		return "hii I am ram controller";
		
	}

}
