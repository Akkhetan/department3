package com.MicroServ.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import com.MicroServ.Repository.DeptRepo;


@Service
@EnableAutoConfiguration
public class DeptServ {
	
	@Autowired
	private DeptRepo deptRepo;
	
	

	public DeptServ() {
		super();
		// TODO Auto-generated constructor stub
	}


/*
	public Department saveDept(Department department) {
		// TODO Auto-generated method stub
		return deptRepo.save(department);
	}*/
	
	public String saveDept() {
		// TODO Auto-generated method stub
		return "Hello Service";
	}

}
