package com.ayungavis.cashierspring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayungavis.cashierspring.exception.ResourceNotFoundException;
import com.ayungavis.cashierspring.model.OrderModel;
import com.ayungavis.cashierspring.repository.OrderRepository;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;
	
	@GetMapping("/orders")
	public List<OrderModel> getAll() {
		return orderRepository.findAll();
	}
	
	@GetMapping("/orders/{id}")
	public ResponseEntity<OrderModel> getById(@PathVariable(value = "id") Long id) throws ResourceNotFoundException {
		OrderModel order = 
				orderRepository
					.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Order not found on :: " + id));
		return ResponseEntity.ok().body(order);
	}
	
	@PostMapping("orders")
	public OrderModel create(@Valid @RequestBody OrderModel order) {
		return orderRepository.save(order);
	}
	
	@PutMapping("orders/{id}")
	public ResponseEntity<OrderModel> update(@PathVariable(value = "id") Long id, @Valid @RequestBody OrderModel inputOrder) throws ResourceNotFoundException {
		OrderModel order = 
				orderRepository
					.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Order not found on :: " + id));
		
		order.setCustomer_name(inputOrder.getCustomer_name());
		order.setItem_name(inputOrder.getItem_name());
		order.setItem_amount(inputOrder.getItem_amount());
		order.setPrice(inputOrder.getPrice());
		order.setPayment(inputOrder.getPayment());
		final OrderModel updatedOrder = orderRepository.save(order);
		return ResponseEntity.ok(updatedOrder);
	}
	
	@DeleteMapping("orders/{id}")
	public Map<String, Boolean> delete(@PathVariable(value = "id") Long id) throws Exception {
		OrderModel order = 
				orderRepository
					.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Order not found on :: " + id));
		
		orderRepository.delete(order);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
