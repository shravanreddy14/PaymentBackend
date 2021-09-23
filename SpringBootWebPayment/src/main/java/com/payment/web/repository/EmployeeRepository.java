package com.payment.web.repository;

import org.springframework.data.repository.CrudRepository;

import com.payment.web.beans.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}
