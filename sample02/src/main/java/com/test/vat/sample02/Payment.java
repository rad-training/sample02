package com.test.vat.sample02;

import java.util.List;
import java.util.Map;

public class Payment {
	private Double amount;
	private String description;
	private String redirectUrl;
	public String methode;
	private Map<String, String> metadata;
	private String locale;

	public Payment(Double amount, String description, String redirectUrl) {
		super();
		this.amount = amount;
		this.description = description;
		this.redirectUrl = redirectUrl;
		// this.methode = methode;
		// this.metadata = metadata;
		// this.locale = locale;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getMethode() {
		return methode;
	}

	public void setMethode(String methode) {
		this.methode = methode;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	public Payment() {

	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(List metadata) {
		this.metadata = (Map<String, String>) metadata;
	}

	@Override
	public String toString() {
		return "Payement [amount=" + amount + ", description=" + description + ", redirectUrl=" + redirectUrl
				+ ", metadata=" + metadata + "]";
	}

}
