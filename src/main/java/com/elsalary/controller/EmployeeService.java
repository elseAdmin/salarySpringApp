package com.elsalary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elsalary.model.EmployeeEntity;
import com.elsalary.model.Request.EmployeeCreateRequest;
import com.elsalary.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	public EmployeeEntity saveEmployee(EmployeeCreateRequest body) {
		EmployeeEntity entity = new EmployeeEntity();
		entity.setAadhaar(body.getAadhaar());
		entity.setAddress(body.getAddress());
		entity.setBasicSalary(body.getBasicSalary());
		entity.setBranchId(body.getBranchId());
		entity.setEsic(body.getEsic());
		entity.setCompanyId(body.getCompanyId());
		entity.setDepartmentId(body.getDepartmentId());
		entity.setContact(body.getContact());
		entity.setDoj(body.getDoj());
		entity.setEmployeeId(body.getEmployeeId());
		entity.setPan(body.getPan());
		entity.setUan(body.getUan());
		entity.setMaritalStatus(body.getMaritalStatus());
		entity.setVariable(body.getVariable());
		entity.setWorkingHours(body.getWorkingHours());
		employeeRepository.save(entity);
		return null;
	}

}
