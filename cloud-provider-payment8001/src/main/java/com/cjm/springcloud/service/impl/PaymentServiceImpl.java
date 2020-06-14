package com.cjm.springcloud.service.impl;

import com.cjm.springcloud.dao.PaymentDao;
import com.cjm.springcloud.entities.Payment;
import com.cjm.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author CJiaM
 * @createTime 2020/6/9 22:55
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
