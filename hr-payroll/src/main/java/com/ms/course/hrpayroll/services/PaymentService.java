package com.ms.course.hrpayroll.services;

import com.ms.course.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, int days) {
        return new Payment("Wanderson", 200.0, days);
    }
}
