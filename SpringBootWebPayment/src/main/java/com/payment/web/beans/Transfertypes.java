package com.payment.web.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transfertypes {
	@Id
	private String transfertypecode; 
	private String transfertypedescription;
	
	public Transfertypes() {
		// TODO Auto-generated constructor stub
	}

	public Transfertypes(String transfertypecode, String transfertypedescription) {
		super();
		this.transfertypecode = transfertypecode;
		this.transfertypedescription = transfertypedescription;
	}

	public String getTransfertypecode() {
		return transfertypecode;
	}

	public void setTransfertypecode(String transfertypecode) {
		this.transfertypecode = transfertypecode;
	}

	public String getTransfertypedescription() {
		return transfertypedescription;
	}

	public void setTransfertypedescription(String transfertypedescription) {
		this.transfertypedescription = transfertypedescription;
	}

	@Override
	public String toString() {
		return "TransferTypes [transfertypecode=" + transfertypecode + ", transfertypedescription="
				+ transfertypedescription + "]";
	}
	
}
