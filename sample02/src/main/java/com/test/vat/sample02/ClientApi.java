package com.test.vat.sample02;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ClientApi {

	public static void main(String[] args) throws MalformedURLException, IOException {

		final String VAT_NUMBER = "BE0833921866";
		final String API_KEY = "1430513e0766659c4eee7b17c824482d";

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://vatapi.com:443/v1/vat-number-check?vatid=" + VAT_NUMBER);
		String response = target.request(MediaType.APPLICATION_JSON).header("Apikey", API_KEY).get(String.class);
		System.out.println("json String = \n" + response);
		ResponseEntity entity = new ObjectMapper().readValue(response, ResponseEntity.class);
		System.out.println(entity.toString());

		if (!entity.isValid()) {
			System.out.println("ce num vat est invalid");
		}
		System.out.println("ce num est valid");
	}
}
