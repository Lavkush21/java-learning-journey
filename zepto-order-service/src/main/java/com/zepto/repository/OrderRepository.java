package com.zepto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zepto.entity.OrderEntity;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, Integer> {

    public OrderEntity findOrdersByOrderId(int orderId);

    @Query("select o from OrderEntity o where o.paymentMethod = :type and o.quantity < 3")
    public List<OrderEntity> findOrderByPaymentType(@Param("type") String paymentType);
}