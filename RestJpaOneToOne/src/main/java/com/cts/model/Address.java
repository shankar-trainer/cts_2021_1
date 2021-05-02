package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addrId;
	private String addrCity;
	private String addrState;

	int getAddrId() {
		return addrId;
	}

	void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	String getAddrCity() {
		return addrCity;
	}

	void setAddrCity(String addrCity) {
		this.addrCity = addrCity;
	}

	String getAddrState() {
		return addrState;
	}

	void setAddrState(String addrState) {
		this.addrState = addrState;
	}

}