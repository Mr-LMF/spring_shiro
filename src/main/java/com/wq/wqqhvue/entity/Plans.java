package com.wq.wqqhvue.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Mr LMF on 2020-03-02 22:48
 */
@Entity
@Data
public class Plans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //SpringData JPA 设置ID属性自动增长！！
    private Integer plan_id;
    private String name;
    private String des;
    private Integer money;
    private Integer status;
}
