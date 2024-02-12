package com.javaexample.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//@GetMapping("/Hello")
	//public String paramExample(@RequestParam("Param") String Param) {
	//	return "Hello I am " + Param;
	//}
	@GetMapping("/Hello/{msg}")
	public String pathVaraibleExample(
			@PathVariable("msg")Integer msg,
			@RequestParam("Param") String Param) {
		return msg + "Hello I am " + Param;
	}

}
