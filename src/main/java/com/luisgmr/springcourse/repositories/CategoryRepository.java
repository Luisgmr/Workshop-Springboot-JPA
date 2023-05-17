package com.luisgmr.springcourse.repositories;

import com.luisgmr.springcourse.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
