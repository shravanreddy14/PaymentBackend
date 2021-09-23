package com.payment.web.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private String customerid;
	private String accountholdername;
	private int overdraftflag;
	private double clearbalance;
	private String customeraddress;
	private String customercity;
	private String customertype;
	
	public Customer() {
		System.out.println("Customer constructor");
	}

	
	public Customer(String customerid, String accountholdername, int overdraftflag, double clearbalance,
			String customeraddress, String customercity, String customertype) {
		super();
		this.customerid = customerid;
		this.accountholdername = accountholdername;
		this.overdraftflag = overdraftflag;
		this.clearbalance = clearbalance;
		this.customeraddress = customeraddress;
		this.customercity = customercity;
		this.customertype = customertype;
	}
	


	public String getCustomerid() {
		return customerid;
	}


	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}


	public String getAccountholdername() {
		return accountholdername;
	}


	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}


	public int getOverdraftflag() {
		return overdraftflag;
	}


	public void setOverdraftflag(int overdraftflag) {
		this.overdraftflag = overdraftflag;
	}


	public double getClearbalance() {
		return clearbalance;
	}


	public void setClearbalance(double clearbalance) {
		this.clearbalance = clearbalance;
	}


	public String getCustomeraddress() {
		return customeraddress;
	}


	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}


	public String getCustomercity() {
		return customercity;
	}


	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}


	public String getCustomertype() {
		return customertype;
	}


	public void setCustomertype(String customertype) {
		this.customertype = customertype;
	}


	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", accountholdername=" + accountholdername + ", overdraftflag="
				+ overdraftflag + ", clearbalance=" + clearbalance + ", customeraddress=" + customeraddress
				+ ", customercity=" + customercity + ", customertype=" + customertype + "]";
	}
	

}
