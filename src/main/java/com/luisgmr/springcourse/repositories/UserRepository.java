package com.luisgmr.springcourse.repositories;

import com.luisgmr.springcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
