package org.vipinmalik.misc;

import java.util.Date;

import org.vmalik.customer.Address;
import org.vmalik.customer.Customer;

import com.google.gson.*;

public class GsonBuilderTest {
	public static void main(String[] args) {
		System.out.println(getJson());
		
		System.out.println(parseJson(getJson()).toString());
	}
	
	public static String getJson() {
		Gson gson = new Gson();
		
		Address addr = new Address();
		addr.setCity("Noida");
		addr.setCountry("Gautam Budh Nagar");
		addr.setHouseNumber("C-12");
		addr.setState("Uttar Pradesh");
		addr.setStreet("Sector-62");
		addr.setZip("201302");
		
		Customer cust = new Customer("Vipin Malik", addr, 28, new Date());
		
		return gson.toJson(cust);
	}
	
	public static Customer parseJson(String inputJson) {
		Gson gson = new Gson();
		
		Customer cust = gson.fromJson(inputJson, Customer.class);
		
		return cust;
	}
}
