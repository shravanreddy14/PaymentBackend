package com.payment.web.repository;

import org.springframework.data.repository.CrudRepository;

import com.payment.web.beans.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction,Integer> {
	
}
