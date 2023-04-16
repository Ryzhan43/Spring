package com.mryzhan.repository;

import com.mryzhan.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustumerRepository extends JpaRepository<Customer,Long> {


}
