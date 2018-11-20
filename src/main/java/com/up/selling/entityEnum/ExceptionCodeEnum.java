package com.up.selling.entityEnum;

import lombok.Getter;

@Getter
public enum ExceptionCodeEnum {
    /** ctrl+shift+u : 变为大写 **/
    PRODUCT_NOT_EXIST(0, "商品不存在"),
    JSON_TRANSFORM_ERROR(1,"对象转换错误"),
    ATTRIBUTES_IS_NOT_EMPTY(3, "属性不能为空");




    private Integer code;
    private String messge;

    ExceptionCodeEnum(Integer code, String messge) {
        this.code = code;
        this.messge = messge;
    }
}
