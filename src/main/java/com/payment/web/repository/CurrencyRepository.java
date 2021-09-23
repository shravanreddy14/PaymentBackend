package com.payment.web.repository;

import org.springframework.data.repository.CrudRepository;

import com.payment.web.beans.Currency;

public interface CurrencyRepository extends CrudRepository<Currency,String> {

}
