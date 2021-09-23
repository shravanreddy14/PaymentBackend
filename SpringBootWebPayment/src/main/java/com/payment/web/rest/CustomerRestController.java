package com.payment.web.rest;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.payment.web.beans.Customer;
import com.payment.web.beans.ResponsePage;
import com.payment.web.beans.Transaction;
import com.payment.web.service.CustomerService;

@RestController
@CrossOrigin()
@RequestMapping("/customer")
public class CustomerRestController {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/{customerid}")
	public ResponseEntity<Object> findCustomerById(@PathVariable String customerid)
	{
		try { 
			Customer cust = this.customerService.findCustomerById(customerid);
			return ResponseEntity.status(HttpStatus.OK)
					.body(cust);
					
			
		}catch (EntityNotFoundException e) {
			System.out.println("error");
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body(new ResponsePage("failure", e.getMessage()));
		}
	}
	@GetMapping
	public List<Customer> getAllCustomers(){
		return this.customerService.getAllCustomers();
	}
	/**@GetMapping("customer/receiver/{receiverid}/amount/{amount}")
	//@RequestBody
	public ResponseEntity<Object> sendMoney(@PathVariable Customer transaction,
			@PathVariable String receiverid,@PathVariable double amount) {
		try {
			Customer c = this.customerService.sendMoney(transaction,receiverid,amount);
			return ResponseEntity.status(HttpStatus.OK)
					.body(c);
		}catch (EntityNotFoundException e) {
			System.out.println("error");
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body(new ResponsePage("failure", e.getMessage()));
		}
	}**/

}
