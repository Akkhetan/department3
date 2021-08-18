package com.MicroServ.department3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = com.MicroServ.Controller.DeptCont.class)
public class Department3Application {

	public static void main(String[] args) {
		SpringApplication.run(Department3Application.class, args);
	}

}
