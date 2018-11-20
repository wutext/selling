package com.up.selling.service.impl;

import com.up.selling.entity.ProductInfo;
import com.up.selling.entityEnum.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl productInfoService;

    @Test
    public void get_Product_info_findByStatus() {

        System.out.println(ProductStatusEnum.UP.getMessage());
        List<ProductInfo> productInfoList = productInfoService.findByStatus(ProductStatusEnum.UP.getCode());

        Assert.assertTrue(productInfoList.size()>0);
    }

    @Test
    public void get_pageProduct_info() {
        PageRequest request = new PageRequest(0, 1);
        Page<ProductInfo> productInfoPage = productInfoService.findAll(request);
        Assert.assertNotNull(productInfoPage);
    }

}