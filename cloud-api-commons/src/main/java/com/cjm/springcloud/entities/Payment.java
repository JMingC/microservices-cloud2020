package com.cjm.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author CJiaM
 * @createTime 2020/6/9 22:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payment implements Serializable {
    //Serializable后期分布式部署会用到
    private Long id;
    private String serial;

}
