package com.elsalary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elsalary.model.Branch;
import com.elsalary.model.Request.BranchCreateRequest;
import com.elsalary.service.BranchService;

@RestController
public class BranchController {

	@Autowired
	private BranchService service;

	@RequestMapping(value = "/branch/add", method = RequestMethod.POST)
	public Branch create(HttpServletRequest request, @RequestBody BranchCreateRequest body) {
		return service.saveBranch(body);
	}

	@RequestMapping(value = "/allBranch/{companyId}", method = RequestMethod.GET)
	public ResponseEntity getAll(HttpServletRequest request, @RequestParam Long companyId) {
		List<Branch> branches = service.getAllBranchForCompany(companyId);

		if (branches == null || branches.size() < 1) {
			return new ResponseEntity("no branches found for given company", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(branches, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/branch/delete/{branchId}", method = RequestMethod.GET)
	public ResponseEntity delete(@RequestParam Long branchId) {
		 service.deleteBranch(branchId);
		 return new ResponseEntity(HttpStatus.OK);
	}

}
