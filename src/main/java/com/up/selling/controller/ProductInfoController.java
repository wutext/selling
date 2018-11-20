package com.up.selling.controller;

import com.up.selling.entity.vo.ProductInfoVo;
import com.up.selling.entity.vo.ProductVo;
import com.up.selling.entity.vo.ResultProductVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/buyer/product")
public class ProductInfoController {

    @GetMapping(value = "/list")
    public ResultProductVo getProduct() {
        ResultProductVo resultProductVo = new ResultProductVo();

        ProductInfoVo productInfoVo = new ProductInfoVo();
        productInfoVo.setProductName("八宝粥");
        productInfoVo.setProductDescription("热的");
        productInfoVo.setProductIcon("http://weixin.com");

        List<ProductInfoVo> productInfoVoList = new ArrayList<>();
        productInfoVoList.add(productInfoVo);

        ProductVo productVo = new ProductVo();
        productVo.setName("热卖");
        productVo.setType("1");
        productVo.setProductInfoVoList(productInfoVoList);

        resultProductVo.setCode(123);
        resultProductVo.setMessage("清单");
        resultProductVo.setData(productVo);
        return resultProductVo;
    }
}
