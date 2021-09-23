package com.payment.web.repository;

import org.springframework.data.repository.CrudRepository;

import com.payment.web.beans.Customer;

public interface CustomerRepository extends CrudRepository<Customer,String> {
	//Customer findByAccountNumberEquals(String customerid);
}
