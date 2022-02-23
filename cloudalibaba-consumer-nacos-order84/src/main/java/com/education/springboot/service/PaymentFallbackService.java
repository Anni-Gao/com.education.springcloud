package com.education.springboot.service;

import com.education.springcloud.entities.CommonResult;
import com.education.springcloud.entities.Payment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class PaymentFallbackService implements PaymentFeignService {
    @Override
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id){
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}

