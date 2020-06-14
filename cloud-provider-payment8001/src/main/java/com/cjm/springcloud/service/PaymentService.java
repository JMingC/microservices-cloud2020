package com.cjm.springcloud.service;

import com.cjm.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author CJiaM
 * @createTime 2020/6/9 22:54
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
