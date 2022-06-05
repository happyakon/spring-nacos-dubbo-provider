package com.akon.spring.provider.domain.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class UserInfo {
    private Integer userId;

    private String userName;

    private Integer userAge;

    private Long userScore;

    private BigDecimal userSalary;

    private String userSex;

    private Date createTime;

    private Date updateTime;

}