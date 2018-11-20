package com.up.selling.repository;

import com.up.selling.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findProductByProductStatus(Integer status);
}
