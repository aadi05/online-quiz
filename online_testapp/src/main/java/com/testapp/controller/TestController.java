package com.testapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testapp.model.Test;
import com.testapp.service.TestService;

@RestController
@CrossOrigin
public class TestController {
	
	@Autowired
	private TestService service;
	
	@GetMapping("test")
	public Test getNewTest() {
		return service.getNewTest();
	}
	
	@PostMapping("test/submit")
	public int submitTest(@RequestBody Test submittedTest) {
		return service.computeResult(submittedTest);
	}
	

}
