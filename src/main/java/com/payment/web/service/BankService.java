package com.payment.web.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.web.beans.Bank;
import com.payment.web.beans.Customer;
import com.payment.web.repository.BankRepository;

@Service
public class BankService {

	@Autowired
	private BankRepository bankRepository;
	public BankService() {
		// TODO Auto-generated constructor stub
	}
	public String getBankNameById(String bic) {
		try {
			Optional<Bank> b = this.bankRepository.findById(bic);
			if (b.isPresent()) {
				Bank bank = b.get();
				return bank.getBankname();
			} else {
				throw new EntityNotFoundException("Bank with "+bic + " does not exist");
			}

		}catch(IllegalArgumentException e )
		{
			return null;
		}
	}
}
