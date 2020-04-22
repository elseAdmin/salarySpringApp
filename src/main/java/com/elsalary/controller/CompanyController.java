package com.elsalary.controller;

import com.elsalary.model.Company;
import com.elsalary.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "/company", method = RequestMethod.POST)
    public Company create(@RequestBody Company company) {
        return companyService.createCompany(company);
    }

    @RequestMapping(value = "/company", method = RequestMethod.GET)
    public List<Company> get() {
        return companyService.getCompany();
    }
}
