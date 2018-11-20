package com.up.selling.repository;

import com.up.selling.entity.OrderDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    Page<OrderDetail> findAllByDetailId(String detailId, Pageable pageable);
}
