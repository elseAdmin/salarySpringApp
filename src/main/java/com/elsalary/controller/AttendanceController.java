package com.elsalary.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elsalary.model.Request.AttendanceCreateRequest;
import com.elsalary.service.AttendanceService;

@RestController
public class AttendanceController {

	@Autowired
	AttendanceService service;

	@RequestMapping(value = "/attendance/create", method = RequestMethod.POST)
	public ResponseEntity createAttendance(HttpServletRequest request, @RequestBody AttendanceCreateRequest body) {
		return service.createAttendance(body);
	}

	@RequestMapping(value = "/getAllAttendance/{empId}", method = RequestMethod.GET)
	public ResponseEntity getAllAttendance(HttpServletRequest request, @PathVariable int empId) {
		return service.getAllAttendanceForEmp((long)empId);
	}

	@RequestMapping(value = "/attendance/{empId}/{month}/{year}", method = RequestMethod.GET)
	public ResponseEntity getAttendance(HttpServletRequest request, @PathVariable Long empId,
			@PathVariable String month, @PathVariable String year) {
		return service.getAttendanceForEmp(empId, month, year);
	}
}
