package com.up.selling.service;

import com.up.selling.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductInfoService {

    public ProductInfo findOne();

    public List<ProductInfo> findByStatus(Integer status);

    public Page<ProductInfo> findAll(Pageable pageable);
}
