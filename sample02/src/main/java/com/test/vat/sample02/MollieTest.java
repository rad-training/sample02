package com.test.vat.sample02;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

public class MollieTest {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		Map<String, String> metadata = new HashMap<>();
		metadata.put("test", "test");

		Payment p = new Payment(500.00, "first payment", "www.example.com/test");

		WebTarget target = client.target("https://api.mollie.nl/v1/payments");
		Response response = target.request()
				.header(HttpHeaders.AUTHORIZATION, "bearer test_PktGwmuBzF2T9XYWKHW2gYDPFkqeze").post(Entity.json(p));

		// Payement payment = response.readEntity(Payement.class);
		System.out.println(response);

	}

}
