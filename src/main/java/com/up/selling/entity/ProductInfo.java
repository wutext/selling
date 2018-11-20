package com.up.selling.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 商品
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String Id;
    /** 名称 */
    private String productName;
    /** 单价 */
    private BigDecimal productPrice;
    /** 库存 */
    private Integer productStock;
    /** 描述 */
    private String productDescription;
    /** 图标 */
    private String productIcon;
    /** 状态： 0-正常，1-下架 */
    private Integer productStatus;
    /** 类目编号 */
    private Integer categoryType;


}
