package com.elsalary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.elsalary.model.Branch;
import com.elsalary.model.Request.BranchCreateRequest;
import com.elsalary.repository.BranchRepository;

@Service
public class BranchService {
	@Autowired
	BranchRepository branchRespository;

	public Branch saveBranch(BranchCreateRequest body) {
		Branch entity = new Branch();
		entity.setAddress(body.getAddress());
		entity.setContactPerson(body.getContactPerson());
		entity.setEmail(body.getEmail());
		entity.setName(body.getName());
		entity.setCompanyId(body.getCompanyId());
		entity.setCreatedByUserId(body.getCreatedByUserId());
		entity.setPhone(body.getPhone());
		return branchRespository.save(entity);
	}

	public List<Branch> getAllBranchForCompany(Long companyId) {
		return branchRespository.getAllBranchForCompany(companyId);
	}

	public void deleteBranch(Long branchId) {
		Branch branch = new Branch();
		branch.setId(branchId);
		branchRespository.delete(branch);
	}
}
