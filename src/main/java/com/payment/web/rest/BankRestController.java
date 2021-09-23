package com.payment.web.rest;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.web.beans.Bank;
import com.payment.web.beans.Customer;
import com.payment.web.beans.ResponsePage;
import com.payment.web.service.BankService;

@RestController
@CrossOrigin()
@RequestMapping("/bank")
public class BankRestController {
	@Autowired
	private BankService bankService;
	@GetMapping(path = "/{bic}")
	public ResponseEntity<Object> getBankNameById(@PathVariable String bic)
	{
		try { 
			String b = this.bankService.getBankNameById(bic);
			return ResponseEntity.status(HttpStatus.OK)
					.body(b);
					
			
		}catch (EntityNotFoundException e) {
			System.out.println("error");
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body(new ResponsePage("failure", e.getMessage()));
		}
	}
}
