package com.javaexample.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaexample.springboot.service.Letter;

@RestController
public class LetterController {
	@PostMapping("/letter")
	public  Letter postLetter(@RequestBody Letter letter) {
		System.out.println(letter);
		return letter;
	}
	
	

}

