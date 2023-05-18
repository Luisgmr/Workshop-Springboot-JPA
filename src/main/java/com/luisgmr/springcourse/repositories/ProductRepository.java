package com.luisgmr.springcourse.repositories;

import com.luisgmr.springcourse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
