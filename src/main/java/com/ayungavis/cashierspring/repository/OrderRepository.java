package com.ayungavis.cashierspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayungavis.cashierspring.model.OrderModel;


public interface OrderRepository extends JpaRepository<OrderModel, Long> {}
