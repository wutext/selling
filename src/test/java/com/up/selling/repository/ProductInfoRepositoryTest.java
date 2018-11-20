package com.up.selling.repository;

import com.up.selling.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void product_info_save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setId("123456");
        productInfo.setProductName("八宝粥");
        productInfo.setProductPrice(new BigDecimal(6.5));
        productInfo.setProductStock(100);
        productInfo.setProductIcon("http://xxx.pig");
        productInfo.setProductStatus(0);
        productInfo.setProductDescription("热门");
        productInfo.setCategoryType(2);
        ProductInfo productInfo1 = productInfoRepository.save(productInfo);
        Assert.assertNotNull(productInfo1);
    }

    @Test
    public void product_info_find_one_by_id() {
        ProductInfo productInfo = productInfoRepository.findOne("123456");
        System.out.println(productInfo.getProductName());
        Assert.assertEquals(productInfo.getProductName(), "八宝粥");
    }
}