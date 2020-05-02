package com.elsalary.repository;

import com.elsalary.model.Department;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	@Query("SELECT d FROM Department d WHERE d.branchId = :id")
	List<Department> getAllDepartmentForBranch(@Param("id") Long branchId);
}
