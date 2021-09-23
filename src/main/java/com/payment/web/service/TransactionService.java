package com.payment.web.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.web.beans.Customer;
import com.payment.web.beans.Transaction;
import com.payment.web.repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository;
	@Autowired
	private CustomerService custService;
	
	public List<Transaction> getAllTransactions() {
		List<Transaction> t = new ArrayList<Transaction>();
		t = (List<Transaction>) this.transactionRepository.findAll();
		return t;
	}
	
	public boolean insertTransaction(Transaction transaction) {
		if (this.transactionRepository.findById(transaction.getTransactionid()).isPresent())
			return false;
		else {
			Customer c = transaction.getCustomerid();
			double amount = transaction.getInramount() + (transaction.getInramount() * 0.25);
			if (custService.sendMoney(c, amount)) {
				transaction.setTransferfees(transaction.getInramount()*0.25);
				transaction.setTransferdate(LocalDate.now());
				this.transactionRepository.save(transaction);
				return true;
			} else {
				return false;
			}
		}
	}

}
