package com.example.microservice.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_DEPT_DETAIL")
public class Department {
	
	@Id
	@SequenceGenerator(sequenceName = "S_DEPT", allocationSize = 1, name = "S_DEPT")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_DEPT")
	@Column(name = "DEPT_ID", precision = 9)
	private Integer deptID;
	
	@Column(name = "DEPT_NAME", length = 50)
	private String deptName;
	
	
	public Department() {
		
	}
	
	

	public Department(Integer deptID, String deptName) {
		this.deptID = deptID;
		this.deptName = deptName;
	}



	public Integer getDeptID() {
		return deptID;
	}



	public void setDeptID(Integer deptID) {
		this.deptID = deptID;
	}



	public String getDeptName() {
		return deptName;
	}



	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}



	

}
