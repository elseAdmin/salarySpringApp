package com.elsalary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.elsalary.model.Attendance;

@Repository
public interface AttendanceRespository extends JpaRepository<Attendance, Long> {
	@Query("SELECT a FROM Attendance a WHERE a.empId = :empId")
	List<Attendance> getAllAttendanceForEmp(Long empId);

	@Query("SELECT a FROM Attendance a WHERE a.empId = :empId AND a.month = :month AND a.year = :year")
	Attendance getAttendance(Long empId, String month, String year);
}
