package com.up.selling.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
@DynamicInsert
@DynamicUpdate
public class OrderDetail {

    @Id
    private String detailId;
    /** 订单id*/
    private String buyerId;
    /** 商品Id*/
    private String productId;
    /** 商品名称*/
    private String productName;
    /** 商品单价*/
    private BigDecimal productPrice;
    /** 商品数量*/
    private Integer productAmount;
    /** 商品图标*/
    private String productIcon;
}
