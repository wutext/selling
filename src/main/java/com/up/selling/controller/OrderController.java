package com.up.selling.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.up.selling.entity.OrderBuyer;
import com.up.selling.entity.OrderDetail;
import com.up.selling.entity.OrderForm;
import com.up.selling.entityEnum.ExceptionCodeEnum;
import com.up.selling.exception.SellException;
import com.up.selling.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/order/buyer")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(value = "/getOrderBuyer")
    public OrderBuyer getOrderBuyer(@Valid OrderForm orderForm, BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            log.error("【属性不能为空】， orderForm = {}", orderForm);
            throw new SellException(ExceptionCodeEnum.ATTRIBUTES_IS_NOT_EMPTY.getCode(), bindingResult.getFieldError().getDefaultMessage());
        }
        OrderBuyer orderBuyer = new OrderBuyer();
        BeanUtils.copyProperties(orderForm,orderBuyer);

        Gson gson = new Gson();
        List<OrderDetail> orderDetails = new ArrayList();
        try {
            orderDetails = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>(){}.getType());
        }catch (Exception e) {
            log.error("【对象转换】错误，String = {}", orderForm.getItems());
            throw new SellException(ExceptionCodeEnum.JSON_TRANSFORM_ERROR);
        }
        orderBuyer.setOrderDetails(orderDetails);
        return orderBuyer;
    }
}
