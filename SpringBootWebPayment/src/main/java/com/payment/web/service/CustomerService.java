package com.payment.web.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.web.beans.Customer;
import com.payment.web.beans.Transaction;
import com.payment.web.repository.CustomerRepository;
import com.payment.web.repository.TransactionRepository;

@Service
public class CustomerService {
	public CustomerService() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private CustomerRepository custRepository;
	
	public  Customer findCustomerById(String id)
	{
		try {
			Optional<Customer> cust = this.custRepository.findById(id);

			return cust.orElseThrow(()->{
	
				return new EntityNotFoundException("Customer with "+id + " does not exist");
			});

		}catch(IllegalArgumentException e )
		{
			return null;
		}

	}
	public List<Customer> getAllCustomers(){
		List<Customer> cust = new ArrayList<Customer>();
		cust = (List<Customer>) this.custRepository.findAll();
		return cust;
	}
	
	public boolean sendMoney(Customer c, double amount) {
		
		String senderAccNo = c.getCustomerid();
		Customer senderAcc = this.findCustomerById(senderAccNo);
		if (senderAcc.getClearbalance() > amount || senderAcc.getOverdraftflag() == 1) {
			senderAcc.setClearbalance(senderAcc.getClearbalance()-amount);
			custRepository.save(senderAcc);
			System.out.println("Balance : " + senderAcc.getClearbalance());
			return true;
		}
		return false;
	}
	
}
