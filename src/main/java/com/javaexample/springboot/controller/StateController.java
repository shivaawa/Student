package com.javaexample.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StateController {
	@GetMapping("/states")
	public List<String> getStates() {
		return Arrays.asList("U.p","Bihar","Delhi","M.P","Utrakhand");
		
	}
}
