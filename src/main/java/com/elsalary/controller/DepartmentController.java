package com.elsalary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elsalary.model.Department;
import com.elsalary.service.DepartmentService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@RequestMapping(value = "/department", method = RequestMethod.POST)
	public Department create(@RequestBody Department department) {
		return departmentService.createDepartment(department);
	}

	@RequestMapping(value = "/allDepartment/{branchId}", method = RequestMethod.GET)
	public ResponseEntity create(@RequestBody Department department, @RequestParam Long branchId) {
		List<Department> departments = departmentService.getAllDepartmentForBranch(branchId);
		if (departments != null || departments.size() < 1)
			return new ResponseEntity("no departments for given branch", HttpStatus.NOT_FOUND);
		return new ResponseEntity(departments, HttpStatus.OK);
	}
}