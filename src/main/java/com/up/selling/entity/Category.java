package com.up.selling.entity;

import com.up.selling.common.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目表
 */
@Entity
@Data
@DynamicUpdate
public class Category extends BaseEntity {

    private String name;
    private String type;

    public Category() {
    }

    public Category(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
