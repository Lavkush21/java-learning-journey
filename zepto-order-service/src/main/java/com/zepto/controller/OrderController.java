package com.zepto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.order.request.OrderRequest;
import com.zepto.response.OrderResponse;
import com.zepto.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	private final OrderService orderService;
	
	@Autowired
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@PostMapping("/place")
	public OrderResponse placeOrder(@RequestBody OrderRequest orderRequest) {
		System.out.println("OrderController placed::::::::::::::::::: Start");
		
		OrderResponse orderResponse = orderService.acceptOrder(orderRequest);
		
		System.out.println("OrderController placed::::::::::::::::::: End");
		
		return orderResponse;
	}
}
