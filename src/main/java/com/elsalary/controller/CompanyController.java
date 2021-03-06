package com.elsalary.controller;

import com.elsalary.model.Company;
import com.elsalary.model.Request.company.CompanyCreateRequest;
import com.elsalary.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@RequestMapping(value = "/company/add", method = RequestMethod.POST)
	public Company create(@RequestBody CompanyCreateRequest companyCreateRequest) {
		return companyService.createCompany(companyCreateRequest);
	}

	@RequestMapping(value = "/company", method = RequestMethod.GET)
	public List<Company> get() {
		return companyService.getCompany();
	}

	@RequestMapping(value = "/company/delete/{companyId}", method = RequestMethod.GET)
	public ResponseEntity delete(@PathVariable Long companyId) {
		companyService.deleteCompany(companyId);
		return new ResponseEntity(HttpStatus.OK);
	}
}
