package com.education.springcloud.service.impl;

import com.education.springcloud.dao.PaymentDao;
import com.education.springcloud.entities.Payment;
import com.education.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired //spring提供
    //@Resource //jdk提供的
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById( Long id){
        return paymentDao.getPaymentById(id);
    }
}

