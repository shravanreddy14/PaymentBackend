package com.payment.web.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CustomerUser {
	@Id
	private int userid;
	private String username;
	@OneToOne
	private Customer customerid;
	private String userpassword;
	public CustomerUser() {
		System.out.println("CustomerUser constructor");
	}
	public CustomerUser(int userid, String username, Customer customerid, String userpassword) {
		super();
		this.userid = userid;
		this.username = username;
		this.customerid = customerid;
		this.userpassword = userpassword;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Customer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Customer customerid) {
		this.customerid = customerid;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	@Override
	public String toString() {
		return "CustomerUser [userid=" + userid + ", username=" + username + ", customerid=" + customerid
				+ ", userpassword=" + userpassword + "]";
	}
	
}
