package com.up.selling.repository;

import com.up.selling.entity.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository detailRepository;

    private static String detailId="10011";
    @Test
    public void saveOrderDetailTest() {
        OrderDetail detail = new OrderDetail();
        detail.setDetailId("sdfjlsaf");
        detail.setBuyerId("abcde12gdadc");
        detail.setProductAmount(2);
        detail.setProductName("花粥");
        detail.setProductPrice(new BigDecimal(12.5));
        detailRepository.save(detail);
        Assert.assertNotNull(detail);
    }
    @Test
    public void findByBuyerOpenId() throws Exception{
        PageRequest pageRequest = new PageRequest(0,1);
        Page<OrderDetail> details = detailRepository.findAllByDetailId(detailId,pageRequest);
        long size=details.getTotalElements();
        System.out.println(size);
    }
}