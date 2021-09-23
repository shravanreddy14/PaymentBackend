package com.payment.web.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Logger {
	@Id
	private int loggerid;
	@OneToOne
	private Customer customerid;
	@OneToOne
	private CustomerUser userid;
	@OneToOne
	private Employee employeeid;
	private String screename;
	private String action;
	private String ipaddress;
	
	public Logger() {
		System.out.println("Logger Constructor");
	}

	public Logger(int loggerid, Customer customerid, CustomerUser userid, Employee employeeid, String screename,
			String action, String ipaddress) {
		super();
		this.loggerid = loggerid;
		this.customerid = customerid;
		this.userid = userid;
		this.employeeid = employeeid;
		this.screename = screename;
		this.action = action;
		this.ipaddress = ipaddress;
	}

	public int getLoggerid() {
		return loggerid;
	}

	public void setLoggerid(int loggerid) {
		this.loggerid = loggerid;
	}

	public Customer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Customer customerid) {
		this.customerid = customerid;
	}

	public CustomerUser getUserid() {
		return userid;
	}

	public void setUserid(CustomerUser userid) {
		this.userid = userid;
	}

	public Employee getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(Employee employeeid) {
		this.employeeid = employeeid;
	}

	public String getScreename() {
		return screename;
	}

	public void setScreename(String screename) {
		this.screename = screename;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	@Override
	public String toString() {
		return "Logger [loggerid=" + loggerid + ", customerid=" + customerid + ", userid=" + userid + ", employeeid="
				+ employeeid + ", screename=" + screename + ", action=" + action + ", ipaddress=" + ipaddress + "]";
	}
	

}
