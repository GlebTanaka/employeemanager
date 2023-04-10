package com.tanakagleb.employeemanager.repository;

import com.tanakagleb.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
