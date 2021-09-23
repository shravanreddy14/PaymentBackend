package com.payment.web.repository;

import org.springframework.data.repository.CrudRepository;

import com.payment.web.beans.CustomerUser;

public interface CustomerUserRepository extends CrudRepository<CustomerUser,Integer> {

}
