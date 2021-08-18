package com.MicroServ.Repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.MicroServ.Model.Department;


@Repository
@EnableJpaRepositories
public interface DeptRepo extends JpaRepository<Department, Long> {

}
