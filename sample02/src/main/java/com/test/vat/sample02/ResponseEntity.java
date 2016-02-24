package com.test.vat.sample02;

import com.fasterxml.jackson.annotation.JsonSetter;

public class ResponseEntity {

	private int status;
	private String countryCode;
	private long vatNumber;
	private String requestDate;
	private boolean valid;
	private String name;
	private String addresse;

	public ResponseEntity() {

	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public long getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(long vatNumber) {
		this.vatNumber = vatNumber;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddrese() {
		return addresse;
	}

	@JsonSetter("address")
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	@Override
	public String toString() {
		return "ResponseEntity [status=" + status + ", countryCode=" + countryCode + ", vatNumber=" + vatNumber
				+ ", requestDate=" + requestDate + ", valid=" + valid + ", name=" + name + ", address=" + addresse
				+ "]";
	}

}
