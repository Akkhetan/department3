package com.example.microservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microservice.Model.Department;
import com.example.microservice.Repository.DeptRepo;

@Service
public class DeptServ {

	@Autowired
	private DeptRepo deptRepo;

	public Department saveDept(Department department) {
		return deptRepo.save(department);
	}

	public String saveDept() {
		return "Hello Service";
	}

}
