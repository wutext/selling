package com.up.selling.service.impl;

import com.up.selling.entity.OrderDetail;
import com.up.selling.entityEnum.ExceptionCodeEnum;
import com.up.selling.exception.SellException;
import com.up.selling.repository.OrderBuyerRepository;
import com.up.selling.repository.OrderDetailRepository;
import com.up.selling.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderBuyerRepository buyerRepository;

    @Autowired
    private OrderDetailRepository detailRepository;

    @Override
    public OrderDetail createOrder() {

        //1. 查询商品
        List<OrderDetail> orderDetails = new ArrayList<>();
        if(CollectionUtils.isEmpty(orderDetails)) {
            throw new SellException(ExceptionCodeEnum.PRODUCT_NOT_EXIST);
        }
        //2. 计算总价 使用mulpity()函数进行计算
        //3. 写入订单数据库
        //4. 扣库存
        return null;
    }
}
