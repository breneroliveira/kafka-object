package com.brener.paymentservice.service;

import com.brener.paymentservice.model.Payment;

public interface PaymentService {

    void senPayment(Payment payment);
}