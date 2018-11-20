package com.up.selling.exception;

import com.up.selling.entityEnum.ExceptionCodeEnum;

public class SellException extends  RuntimeException{

    private Integer code;
    private String message;

    public SellException(ExceptionCodeEnum productNotExist) {
        super();
        this.code= ExceptionCodeEnum.PRODUCT_NOT_EXIST.getCode();
    }

    public SellException(Integer code,String message) {
        super();
        this.code= ExceptionCodeEnum.PRODUCT_NOT_EXIST.getCode();
    }
}
