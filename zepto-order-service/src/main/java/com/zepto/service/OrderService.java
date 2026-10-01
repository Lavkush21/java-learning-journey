package com.zepto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.OrderEntity;
import com.zepto.order.request.OrderRequest;
import com.zepto.order.response.OrderResponse;
import com.zepto.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public OrderResponse acceptOrder(OrderRequest request) {
        System.out.println("OrderService.acceptOrder()::::Start");

        // Request → Entity
        OrderEntity entity = new OrderEntity();
        entity.setCustomerId(request.getCustomerId());
        entity.setProductId(request.getProductId());
        entity.setQuantity(request.getQuantity());
        entity.setPaymentMethod(request.getPaymentMethod());
        entity.setShippingAddress(request.getShippingAddress());

   
        OrderEntity saved = orderRepository.save(entity);

        // Entity → Response
        OrderResponse response = new OrderResponse();
        response.setId(saved.getId());
        response.setCustomerId(saved.getCustomerId());
        response.setProductId(saved.getProductId());
        response.setQuantity(saved.getQuantity());
        response.setPaymentMethod(saved.getPaymentMethod());
        response.setShippingAddress(saved.getShippingAddress());

        System.out.println("OrderService.acceptOrder()::::End");
        return response;
    }
     
    public List<OrderResponse> listOrdersByPayment(String paymentType) {
        System.out.println("OrderService.listOrdersByPayment()::::Start");

        List<OrderEntity> entities = (List<OrderEntity>) orderRepository.findOrderByPaymentType(paymentType);

        List<OrderResponse> responses = new ArrayList<>();
        for (OrderEntity entity : entities) {
            OrderResponse response = new OrderResponse();
            response.setId(entity.getId());
            response.setCustomerId(entity.getCustomerId());
            response.setProductId(entity.getProductId());
            response.setQuantity(entity.getQuantity());
            response.setPaymentMethod(entity.getPaymentMethod());
            response.setShippingAddress(entity.getShippingAddress());
            responses.add(response);
        }

        System.out.println("OrderService.listOrdersByPayment()::::End");
        return responses;
    }
}