package com.naveen.soap;

import javax.xml.ws.Endpoint;

public class SoapPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:4567/pss/pc", new ProductCatalog());
		System.out.println("done");
	}

}
