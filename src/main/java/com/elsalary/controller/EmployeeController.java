package com.elsalary.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elsalary.model.EmployeeEntity;
import com.elsalary.model.Request.EmployeeCreateRequest;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@RequestMapping(value = "/employee/add", method = RequestMethod.POST)
	public EmployeeEntity createEmployee(HttpServletRequest request, @RequestBody EmployeeCreateRequest body) {
		return service.saveEmployee(body);
	}
}
