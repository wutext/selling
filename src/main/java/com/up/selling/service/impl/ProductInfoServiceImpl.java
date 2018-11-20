package com.up.selling.service.impl;

import com.up.selling.entity.ProductInfo;
import com.up.selling.entityEnum.ProductStatusEnum;
import com.up.selling.repository.ProductInfoRepository;
import com.up.selling.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInfoServiceImpl implements ProductInfoService{

    @Autowired
    private ProductInfoRepository productInfoRepository;


    @Override
    public ProductInfo findOne() {
        return null;
    }

    @Override
    public List<ProductInfo> findByStatus(Integer status) {
        return productInfoRepository.findProductByProductStatus(status);
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return productInfoRepository.findAll(pageable);
    }
}
