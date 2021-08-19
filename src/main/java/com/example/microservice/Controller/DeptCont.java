package com.example.microservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.Service.DeptServ;


@RestController
@RequestMapping("/departments")
public class DeptCont {
	
	@Autowired
	private DeptServ deptServ;
	
	/*
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		return deptServ.saveDept(department);
	}*/
	
	@PostMapping("/save")
	public String saveDepartment() {
		return deptServ.saveDept();
	}
	
	@GetMapping
	public String  sayHI() {
	return "Hello";
	
	}
	
	/*
	@PostMapping("/")
	public String  sayHIPost() {
	return "Hello Post";
	
	}*/



}
