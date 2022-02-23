package com.education.springcloud.service.impl;


import com.education.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.education.springcloud.dao.PaymentDao;
import com.education.springcloud.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired //spring提供
    //@Resource //jdk提供的
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

