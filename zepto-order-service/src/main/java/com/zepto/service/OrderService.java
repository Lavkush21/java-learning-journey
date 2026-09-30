package com.zepto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.OrderEntity;
import com.zepto.repository.OrderRepository;
import com.zepto.response.OrderResponse;

@Service
public class OrderService {
	
	@Autowired
	 OrderRepository orderRepository;
	
	public OrderResponse getOrerById(int orderId) {
		System.out.println("OrderService.getOrderById():::::::::Start");
		// OrderEntity entity = orderRepository.findById(orderId).get();
	
		OrderEntity entity = orderRepository.findOrdersByOrderId(orderId);
	         OrderResponse response = new OrderResponse();
	         response.setId(entity.getId());
	         response.setCustomerId(entity.getCustomerId());
	         response.setOrderId(entity.getOrderId());
	         response.setProductId(entity.getProductId());
	         response.setQuantity(entity.getQuantity());
	         
	         
	 		System.out.println("OrderService.getOrderById():::::::::End");
	         return response;
	}
	
	
	
	
}
