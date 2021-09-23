package com.payment.web.beans;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Transaction {
	@Id
	private int transactionid;
	@OneToOne
	@JoinColumn(name="customerid")
	private Customer customer;
	//private String customerid;
	@OneToOne
	@JoinColumn(name="currencycode")
	private Currency currency;
	
	@OneToOne
	@JoinColumn(name="senderBIC")
	private Bank sender;
	@OneToOne
	@JoinColumn(name="receiverBIC")
	private Bank receiver;
	private String receiveraccountholdernumber;
	private String receiveraccountholdername;
	@OneToOne
	@JoinColumn(name="transfertypecode")
	private Transfertypes transfertype;
	@OneToOne
	@JoinColumn(name="messagecode")
	private Message message;
	private double currencyamount;
	private double transferfees;
	private double inramount;
	private LocalDate transferdate;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	public Transaction(int transactionid, Customer customerid, Currency currencycode, Bank senderBIC, Bank receiverBIC,
			String receiveraccountholdernumber, String receiveraccountholdername, Transfertypes transfertypecode,
			Message messagecode, double currencyamount, double transferfees, double inramount, LocalDate transferdate) {
		super();
		this.transactionid = transactionid;
		this.customer = customerid;
		this.currency = currencycode;
		this.sender = senderBIC;
		this.receiver = receiverBIC;
		this.receiveraccountholdernumber = receiveraccountholdernumber;
		this.receiveraccountholdername = receiveraccountholdername;
		this.transfertype = transfertypecode;
		this.message = messagecode;
		this.currencyamount = currencyamount;
		this.transferfees = transferfees;
		this.inramount = inramount;
		this.transferdate = transferdate;
	}
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public Customer getCustomerid() {
		return customer;
	}
	public void setCustomerid(Customer customerid) {
		this.customer = customerid;
	}
	public Currency getCurrencycode() {
		return currency;
	}
	public void setCurrencycode(Currency currencycode) {
		this.currency = currencycode;
	}
	public Bank getSenderBIC() {
		return sender;
	}
	public void setSenderBIC(Bank senderBIC) {
		this.sender = senderBIC;
	}
	public Bank getReceiverBIC() {
		return receiver;
	}
	public void setReceiverBIC(Bank receiverBIC) {
		this.receiver = receiverBIC;
	}
	public String getReceiveraccountholdernumber() {
		return receiveraccountholdernumber;
	}
	public void setReceiveraccountholdernumber(String receiveraccountholdernumber) {
		this.receiveraccountholdernumber = receiveraccountholdernumber;
	}
	public String getReceiveraccountholdername() {
		return receiveraccountholdername;
	}
	public void setReceiveraccountholdername(String receiveraccountholdername) {
		this.receiveraccountholdername = receiveraccountholdername;
	}
	public Transfertypes getTransfertypecode() {
		return transfertype;
	}
	public void setTransfertypecode(Transfertypes transfertypecode) {
		this.transfertype = transfertypecode;
	}
	public Message getMessagecode() {
		return message;
	}
	public void setMessagecode(Message messagecode) {
		this.message = messagecode;
	}
	public double getCurrencyamount() {
		return currencyamount;
	}
	public void setCurrencyamount(double currencyamount) {
		this.currencyamount = currencyamount;
	}
	public double getTransferfees() {
		return transferfees;
	}
	public void setTransferfees(double transferfees) {
		this.transferfees = transferfees;
	}
	public double getInramount() {
		return inramount;
	}
	public void setInramount(double inramount) {
		this.inramount = inramount;
	}
	public LocalDate getTransferdate() {
		return transferdate;
	}
	public void setTransferdate(LocalDate transferdate) {
		this.transferdate = transferdate;
	}
	@Override
	public String toString() {
		return "Transaction [transactionid=" + transactionid + ", customerid=" + customer + ", currencycode="
				+ currency + ", senderBIC=" + sender + ", receiverBIC=" + receiver
				+ ", receiveraccountholdernumber=" + receiveraccountholdernumber + ", receiveraccountholdername="
				+ receiveraccountholdername + ", transfertypecode=" + transfertype + ", messagecode=" + message
				+ ", currencyamount=" + currencyamount + ", transferfees=" + transferfees + ", inramount=" + inramount
				+ ", transferdate=" + transferdate + "]";
	}
	
	
	
	
}
