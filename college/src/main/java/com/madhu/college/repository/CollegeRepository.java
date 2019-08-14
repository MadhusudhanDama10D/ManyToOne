package com.madhu.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madhu.college.model.College;

public interface CollegeRepository extends JpaRepository<College, Integer> {

}
