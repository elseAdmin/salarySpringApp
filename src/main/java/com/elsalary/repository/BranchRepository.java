package com.elsalary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.elsalary.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {
	@Query("SELECT b FROM Branch b WHERE b.companyId = :id")
	List<Branch> getAllBranchForCompany(@Param("id") Long companyId);
}
