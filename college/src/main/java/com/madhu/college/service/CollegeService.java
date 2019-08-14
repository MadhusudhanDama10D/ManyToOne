package com.madhu.college.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.madhu.college.model.College;
import com.madhu.college.model.Department;
import com.madhu.college.repository.CollegeRepository;
import com.madhu.college.repository.DepartmentRepository;

@Component
public class CollegeService {
	@Autowired
	DepartmentRepository repo;

	@Autowired
	CollegeRepository repos;

	public Department insert(Department department) {
		return repo.save(department);

	}
	
	public ArrayList<Department> getAll()
	{
		return (ArrayList<Department>) repo.findAll();
		
	}
	
	public  College newInsert(College college) {
		return repos.save(college);
		
		
	}
	
	public ArrayList<College> newGetAll() {
		return (ArrayList<College>) repos.findAll();
		
	}

}
