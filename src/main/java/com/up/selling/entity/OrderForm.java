package com.up.selling.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 买家选择商品提交的表单信息
 */
@Data
public class OrderForm {

    /** 顾客名称*/
    @NotEmpty(message = "不能为空")
    private String buyerName;
    /** 电话*/
    @NotEmpty(message = "不能为空")
    private String buyerPhone;
    /** 地址*/
    @NotEmpty(message = "不能为空")
    private String buyerAddress;
    /** 微信id*/
    @NotEmpty(message = "不能为空")
    private String openId;
    /** 购物车商品信息 : json格式*/
    @NotEmpty(message = "不能为空")
    private String items;
}
