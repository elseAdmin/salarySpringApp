package com.elsalary.service;

import com.elsalary.model.Company;
import com.elsalary.model.Request.company.CompanyCreateRequest;
import com.elsalary.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company createCompany(CompanyCreateRequest companyCreateRequest) {
        Company company = new Company();
        company.setName(companyCreateRequest.getName());
        company.setAddress(companyCreateRequest.getAddress());
        company.setEmail(companyCreateRequest.getEmail());
        company.setPhoneNo(companyCreateRequest.getPhoneNo());
        company.setWebsite(companyCreateRequest.getWebsite());
        company.setUserId(companyCreateRequest.getUserId());
        company.setContactPerson(companyCreateRequest.getContactPerson());
        company.setMobileNo(companyCreateRequest.getMobileNo());
        return companyRepository.save(company);
    }

	public List<Company> getCompany() {
		return companyRepository.findAll();
	}
}
