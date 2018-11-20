package com.up.selling.entity.vo;

import lombok.Data;

@Data
public class ResultProductVo<T> {

    private Integer code;
    private String message;
    private T data;
}
