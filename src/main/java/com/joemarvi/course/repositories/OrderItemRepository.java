package com.joemarvi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joemarvi.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}