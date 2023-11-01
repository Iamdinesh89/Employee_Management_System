package com.Springboot.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.Employee.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
