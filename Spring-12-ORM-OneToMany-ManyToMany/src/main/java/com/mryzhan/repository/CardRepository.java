package com.mryzhan.repository;

import com.mryzhan.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Cart,Long> {


}
