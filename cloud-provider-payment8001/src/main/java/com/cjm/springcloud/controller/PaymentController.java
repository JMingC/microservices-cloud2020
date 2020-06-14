package com.cjm.springcloud.controller;

import com.cjm.springcloud.entities.CommonResult;
import com.cjm.springcloud.entities.Payment;
import com.cjm.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author CJiaM
 * @createTime 2020/6/9 22:58
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("Payment插入结果：" + result);
        if (result > 0){
            return new CommonResult<Payment>(200,"插入数据库成功",payment);
        }else {
            return new CommonResult<Payment>(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("获取结果:" + payment);

        if (payment != null){
            return new CommonResult(200,"查询成功" ,payment);
        }else {
            return new CommonResult(444,"没有对应记录，查询ID:" + id,null);
        }
    }
}
