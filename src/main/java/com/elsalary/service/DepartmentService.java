package com.elsalary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elsalary.model.Department;
import com.elsalary.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }
    
    public List<Department> getAllDepartmentForBranch(Long branchId){
    	return departmentRepository.getAllDepartmentForBranch(branchId);
    }

	public void deleteDepartment(Long departmentId) {
		Department dept = new Department();
		dept.setId(departmentId);
		departmentRepository.delete(dept);
	}
}
