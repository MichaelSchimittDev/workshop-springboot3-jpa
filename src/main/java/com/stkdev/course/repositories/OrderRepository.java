package com.stkdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stkdev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
