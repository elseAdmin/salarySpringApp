package com.elsalary.controller;

import com.elsalary.model.Department;
import com.elsalary.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/department", method = RequestMethod.POST)
    public Department create(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }
}