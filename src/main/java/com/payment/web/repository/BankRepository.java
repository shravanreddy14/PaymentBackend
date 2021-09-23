package com.payment.web.repository;

import org.springframework.data.repository.CrudRepository;

import com.payment.web.beans.Bank;

public interface BankRepository extends CrudRepository<Bank,String> {

}
