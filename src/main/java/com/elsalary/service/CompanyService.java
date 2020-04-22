package com.elsalary.service;

import com.elsalary.model.Company;
import com.elsalary.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public ResponseEntity createCompany(Company company) {
        return null;
    }
}
