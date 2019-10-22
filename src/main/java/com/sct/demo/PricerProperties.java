package com.sct.demo;

import java.util.Map;

import lombok.Data;

@Data
public class PricerProperties {

	private Map<Item, Integer> ratingMap;
	
}
