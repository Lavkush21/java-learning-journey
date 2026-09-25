package com.zepto.service;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.OrderEntity;
import com.zepto.order.request.OrderRequest;
import com.zepto.repository.OrderRepository;
import com.zepto.response.OrderResponse;

@Service
public class OrderService {
	
	private final OrderRepository orderRepository;
	
	@Autowired
	public OrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}
	
	public OrderResponse acceptOrder(OrderRequest orderRequest) {
		System.out.println("OrderService acceptOrder::::::::::::::::::: Start");
		
		OrderEntity entity = new OrderEntity();
		entity.setCustomerId(orderRequest.getCustomerId());
		entity.setPaymentMethod(orderRequest.getPaymentMethod());
		entity.setProductId(orderRequest.getProductId());
		entity.setQuantity(orderRequest.getQuantity());
		entity.setShippingAddress(orderRequest.getShippingAddress());
		entity.setOrderId(generateOrderId());
		
		// Save entity to MySQL
		OrderEntity responseEntity = orderRepository.save(entity);
		
		// FIX: Map values to the specific OrderResponse attributes
		OrderResponse orderResponse = new OrderResponse();
		orderResponse.setOrderId(String.valueOf(responseEntity.getOrderId())); // Converts int to String
		orderResponse.setCustomerId((long) responseEntity.getCustomerId());   // Casts int to Long
		
		// Calculate a mock total amount based on item quantity (e.g., ₹99 per item)
		orderResponse.setTotalAmount(responseEntity.getQuantity() * 99.00);
		
		// Set tracking statuses
		orderResponse.setPaymentStatus("PAID");
		orderResponse.setOrderStatus("PLACED");
		
		System.out.println("OrderService acceptOrder::::::::::::::::::: End");
	
		return orderResponse;
	}
	
	private int generateOrderId() {
		Random random = new Random();
		return 10000 + random.nextInt(90000);
	}
}
