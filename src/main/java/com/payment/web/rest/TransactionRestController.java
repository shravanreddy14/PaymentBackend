package com.payment.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.web.beans.ResponsePage;
import com.payment.web.beans.Transaction;
import com.payment.web.service.TransactionService;

@RestController
@CrossOrigin()
@RequestMapping("/transaction")
public class TransactionRestController {
	
	@Autowired
	private TransactionService tranService;
	
	@GetMapping
	public List<Transaction> getAllTransactions() {
		return this.tranService.getAllTransactions();
	}
	
	@PostMapping
	public ResponseEntity<Object> insertTransaction(@RequestBody Transaction transaction) {
		if (this.tranService.insertTransaction(transaction)) {
			return ResponseEntity.status(HttpStatus.OK)
					.body("Transaction inserted successfully");
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("Transaction Failed");
		}
	}
	

}
