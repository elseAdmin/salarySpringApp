package com.elsalary.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elsalary.model.BranchEntity;
import com.elsalary.model.Request.BranchCreateRequest;
import com.elsalary.service.BranchService;

@RestController
public class BranchController {

    @Autowired
    private BranchService service;

    @RequestMapping(value = "/branch/add", method = RequestMethod.POST)
    public BranchEntity createAdmin(HttpServletRequest request,@RequestBody BranchCreateRequest body) {
        return service.saveBranch(body);
    }
}
