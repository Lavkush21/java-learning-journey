package com.zepto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.response.OrderResponse;
import com.zepto.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
        @Autowired
        OrderService orderService;
        
        @GetMapping("findOrder")
        public OrderResponse searchOrderById(@RequestParam("id") int id)
        {
              return orderService.getOrerById(id);	
        }
}
