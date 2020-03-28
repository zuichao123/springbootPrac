package com.sunjian.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author sunjian
 * @date 2020/3/27 22:30
 */
@Data
public class Student implements Serializable {
    private Integer id;
    private String name;
}
