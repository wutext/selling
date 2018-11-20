package com.up.selling.repository;

import com.up.selling.entity.OrderBuyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderBuyerRepository extends JpaRepository<OrderBuyer, String>{


}
