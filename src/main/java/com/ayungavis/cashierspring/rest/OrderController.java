package com.ayungavis.cashierspring.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayungavis.cashierspring.model.OrderModel;

@RestController
@RequestMapping("/api/order")
public class OrderController {

	@RequestMapping("/add")
	public OrderModel add() {
		return null;
	}
	
	@RequestMapping("/list")
	public OrderModel list() {
		return null;
		
	}
}
