package com.elsalary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elsalary.model.BranchEntity;
import com.elsalary.model.Request.BranchCreateRequest;
import com.elsalary.repository.BranchRepository;

@Service
public class BranchService {
	@Autowired
	BranchRepository branchRespository;
	
	public BranchEntity saveBranch(BranchCreateRequest body) {
		BranchEntity entity = new BranchEntity();
		entity.setAddress(body.getAddress());
		entity.setContactPerson(body.getContactPerson());
		entity.setEmail(body.getEmail());
		entity.setName(body.getName());
		entity.setCompanyId(body.getCompanyId());
		return branchRespository.save(entity);
	}

}
