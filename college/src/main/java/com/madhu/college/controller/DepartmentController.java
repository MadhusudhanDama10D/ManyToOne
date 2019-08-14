package com.madhu.college.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhu.college.model.College;
import com.madhu.college.model.Department;
import com.madhu.college.service.CollegeService;

@RestController
@RequestMapping("/college")
public class DepartmentController {
	@Autowired
	CollegeService service;

	@PostMapping("/dept/insert")
	public Department insert(@RequestBody Department department) {
		return service.insert(department);

	}

	@GetMapping("/dept/getall")
	public ArrayList<Department> getAll() {
		return service.getAll();

	}

	@PostMapping("/college/insert")
	public College newInsert(@RequestBody College college) {
		return service.newInsert(college);

	}

	@GetMapping("/college/getall")
	public ArrayList<College> newGetAll() {
		return service.newGetAll();

	}

}
