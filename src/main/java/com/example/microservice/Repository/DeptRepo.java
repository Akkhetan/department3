package com.example.microservice.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.microservice.Model.Department;


@Repository
@EnableJpaRepositories
public interface DeptRepo extends JpaRepository<Department, Integer>, Serializable {

}
