package com.jepc.example.table.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jepc.example.table.model.Customer_Profile;
import com.jepc.example.table.model.Profile;

import lombok.extern.apachecommons.CommonsLog;

@RestController
@CommonsLog
@RequestMapping("/data/v1")
public class TableDataController {
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/listData")
	public List<Customer_Profile> getData() {
		
		log.info("Starting to list data: ");
		List<Customer_Profile> response = new ArrayList<>();
		
		Customer_Profile data= new Customer_Profile();
		Customer_Profile data2= new Customer_Profile();
		Customer_Profile data3= new Customer_Profile();
		Customer_Profile data4= new Customer_Profile();
		Customer_Profile data5= new Customer_Profile();
		Customer_Profile data6= new Customer_Profile();
		Customer_Profile data7= new Customer_Profile();


		try {
					
			//here I create this object a lot of times, you can fill the list as you want hahaa, or retrieve from a service, API or DB
			data.setId("00.623.904/0001-73");
			data.setCustomer_name("Nestle");
			data.setStatus("Active");
			data.setExtra1("extra1");
			
			response.add(data);
			
			data2.setId("00.623.904/0056-77");
			data2.setCustomer_name("Oi");
			data2.setStatus("Active");
			data2.setExtra1("extra1");
			
			response.add(data2);

			data3.setId("00.623.904/0056-72");
			data3.setCustomer_name("COCA");
			data3.setStatus("Active");
			data3.setExtra1("extra1");
			
			response.add(data3);
			
			data4.setId("00.623.904/0056-71");
			data4.setCustomer_name("Pepsi");
			data4.setStatus("Active");
			data4.setExtra1("extra1");
			
			response.add(data4);
			
			data5.setId("00.623.904/0056-72");
			data5.setCustomer_name("Amazon");
			data5.setStatus("Active");
			data5.setExtra1("extra1");
			
			response.add(data5);
			
			data6.setId("00.623.904/0056-79");
			data6.setCustomer_name("Google");
			data6.setStatus("Active");
			data6.setExtra1("extra1");
			
			response.add(data6);
			
			data7.setId("00.623.904/0056-7#");
			data7.setCustomer_name("Ford");
			data7.setStatus("Active");
			data7.setExtra1("extra1");
			
			response.add(data7);
			
			
			return response;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/listData3")
	public List<Profile> getData2() {
		
		List<Profile> response = new ArrayList<>();
		
		Profile p= new Profile();
		Profile p2= new Profile();
		
		p.setCname("Nestle");
		p.setCcontact("John Doe");
		p.setPhone("123 456 7890");
		p.setSecond_phone("789 456 1230");
		p.setStreet("Rio de Janeiro");
		p.setSenderaccount("0000000");
		p.setPaymnetaccount("1111111");
		p.setShipmentcredential("JSOJnhrhr39");
		p.setPreferedservice("Economy");
		p.setSecondservice("International");
		p.setPackaging("BOX");
		p.setId("00.623.904/0001-73");

		
		response.add(p);
		
		p2.setCname("Oi");
		p2.setCcontact("Harry Potter");
		p2.setPhone("123 456 7890");
		p2.setSecond_phone("789 456 1230");
		p2.setStreet("Hogwarts");
		p2.setSenderaccount("00000330");
		p2.setPaymnetaccount("444444");
		p2.setShipmentcredential("JSOJnhrhr39");
		p2.setPreferedservice("Economy");
		p2.setSecondservice("International");
		p2.setPackaging("ENVELOPE");
		p2.setId("00.623.904/0056-77");
		
		
		response.add(p2);
		
		return response;

	}
	


}
