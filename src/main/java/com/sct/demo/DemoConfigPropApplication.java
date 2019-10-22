package com.sct.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoConfigPropApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoConfigPropApplication.class, args);
	}

	@Bean
	@ConfigurationProperties("pricer.refdata")
	public PricerProperties getPricerProperties()
	{
		return new PricerProperties();
	}
	
	@Bean
	CommandLineRunner run(PricerProperties pricerProperties)
	{
		return (
				argv ->
					{
						Map <String, Integer> tempName = new HashMap<String, Integer>();
						
						tempName.put("AB+", 12);
						tempName.put("A",123);
						
						//tempName.forEach((k,v) -> System.out.println("tempName \n\n"+ k+"  <===>  "+v+"\n\n"));
						
						System.out.println("AA++".replace("+", "_PLUS").replace("-", "_MINUS"));
						
						pricerProperties.getRatingMap().forEach((k,v) -> System.out.println("\n\n"+ k+"  <===>  "+v+"\n\n"));
					
					//	System.out.println("AA+".replaceAll("+", "_PLUS").replaceAll("-", "_MINUS"));
					
						System.out.println(pricerProperties.getRatingMap().get(new Item("AA+")));
					
					}
				);
		
	}
}
