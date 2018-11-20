package com.up.selling.entity.vo;

import lombok.Data;

import java.util.List;

@Data
public class ProductVo {

    private String name;
    private String type;
    private List<ProductInfoVo> productInfoVoList;
}
