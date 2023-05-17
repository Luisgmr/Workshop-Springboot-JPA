package com.luisgmr.springcourse.repositories;

import com.luisgmr.springcourse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepository extends JpaRepository<Order, Long> {

}
