package com.luisgmr.springcourse.repositories;

import com.luisgmr.springcourse.entities.OrderItem;
import com.luisgmr.springcourse.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
