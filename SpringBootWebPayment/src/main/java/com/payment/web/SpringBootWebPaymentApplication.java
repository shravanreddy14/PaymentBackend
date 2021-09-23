package com.payment.web; 

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.payment.web.beans.Bank;
import com.payment.web.beans.Customer;
import com.payment.web.repository.BankRepository;
import com.payment.web.repository.CustomerRepository;

@SpringBootApplication 
public class SpringBootWebPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebPaymentApplication.class, args);
	}
	
	@Autowired
	private CustomerRepository custrepo; 
	@Autowired
	private BankRepository bankrepo; 
	
	
	/**@Bean
	public void insertCustomerData()
	{
		System.out.println("inserting customer");
		List<Customer> customers = Arrays.asList(
				new Customer("69652133523248","HDFC BANK -(CHENNAI)",1,223997,null,null,"B"),
				new Customer("71319440983198","A M MAYANNA",0,221470,null,null,"I"),
				new Customer("83020817828620","A KRISHNA MOHAN",1,56000,null,null,"I")
				);
		custrepo.saveAll(customers);
	}
	@Bean
	public void insertBankData()
	{
		System.out.println("inserting bank details");
		List<Bank> bank = Arrays.asList(
				new Bank("ABBLINBBXXX","AB BANK LIMITED"),
				new Bank("ABNAINBBAHM","ABN AMRO BANK N.V."),
				new Bank("ACBLINBBXXX","ABHYUDAYA CO-OPERATIVE BANK LTD.")
				);
		bankrepo.saveAll(bank);
	} **/

}
