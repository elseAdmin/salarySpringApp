package com.elsalary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.elsalary.model.Attendance;
import com.elsalary.model.Request.AttendanceCreateRequest;
import com.elsalary.repository.AttendanceRespository;

@Service
public class AttendanceService {

	@Autowired
	AttendanceRespository repository;

	public ResponseEntity createAttendance(AttendanceCreateRequest request) {
		Attendance attendance = new Attendance();
		attendance.setCasualLeaves(request.getCasualLeaves());
		attendance.setEmpId(request.getEmpId());
		attendance.setMonth(request.getMonth());
		attendance.setOtWorkingHours(request.getOtWorkingHours());
		attendance.setPaidDays(request.getPaidDays());
		attendance.setSickLeaves(request.getSickLeaves());
		attendance.setWorkingDays(request.getSickLeaves());
		attendance.setYear(request.getYear());
		try {
			repository.save(attendance);
			return new ResponseEntity(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity("Error occured", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity getAllAttendanceForEmp(Long empId) {
		List<Attendance> allAttendance = repository.getAllAttendanceForEmp(empId);
		if (allAttendance == null || allAttendance.size() < 1) {
			return new ResponseEntity("no records found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(allAttendance, HttpStatus.OK);
	}

	public ResponseEntity getAttendanceForEmp(Long empId, String month, String year) {
		Attendance attendance = repository.getAttendance(empId, month, year);
		if (attendance == null) {
			return new ResponseEntity("no records found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(attendance, HttpStatus.OK);
	}
}
