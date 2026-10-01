package com.zepto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.order.request.OrderRequest;
import com.zepto.order.response.OrderResponse;
import com.zepto.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/findOrder")
    public OrderResponse searchOrderById(@RequestParam("id") int id) {
        return orderService.getOrderById(id);
    }

    @GetMapping("/findOrderByPayment")
    public List<OrderResponse> findOrderByPayment(@RequestParam("paymentType") String paymentType) {
        return orderService.listOrdersByPayment(paymentType);
    }
}