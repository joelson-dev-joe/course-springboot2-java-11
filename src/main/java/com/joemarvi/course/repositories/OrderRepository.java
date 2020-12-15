package com.joemarvi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joemarvi.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
