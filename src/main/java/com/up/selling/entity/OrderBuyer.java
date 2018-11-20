package com.up.selling.entity;

import com.up.selling.entityEnum.OrderStatusEnum;
import com.up.selling.entityEnum.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 客户订单
 */

@Entity
@Data
@DynamicInsert
@DynamicUpdate
public class OrderBuyer {

    /** 订单id*/
    @Id
    private String buyerId;
    /** 买家名称*/
    private String buyerName;
    /** 买家电话*/
    private String buyerPhone;
    /** 买家地址*/
    private String buyerAddress;

    /** 微信id*/
    private String openId;
    /** 订单总额*/
    private BigDecimal orderAmount;
    /** 订单状态*/
    private Integer orderStatus  = OrderStatusEnum.NEW.getCode();
    /** 支付状态*/
    private Integer buyStatus = PayStatusEnum.WAIT.getCode();

    private Date createTime;
    private Date updateTime;

    @Transient
    private List<OrderDetail> orderDetails;
}
