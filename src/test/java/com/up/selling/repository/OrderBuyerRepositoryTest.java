package com.up.selling.repository;

import com.up.selling.entity.OrderBuyer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderBuyerRepositoryTest {

    @Autowired
    private OrderBuyerRepository buyerRepository;

    @Test
    public void saveOrderBuyerTest() {
        OrderBuyer buyer = new OrderBuyer();
        buyer.setBuyerId("abcde12gdadc");
        buyer.setBuyerName("王丽");
        buyer.setBuyerAddress("朝阳门 ");
        buyer.setBuyerPhone("1234568972");
        buyer.setCreateTime(new Date());
        buyerRepository.save(buyer);
        Assert.assertNotNull(buyer);
    }

}