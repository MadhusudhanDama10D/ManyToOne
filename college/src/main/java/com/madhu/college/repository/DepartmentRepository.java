package com.madhu.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madhu.college.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
