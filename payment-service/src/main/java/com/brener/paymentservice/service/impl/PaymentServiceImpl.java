package com.brener.paymentservice.service.impl;

import com.brener.paymentservice.model.Payment;
import com.brener.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void senPayment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: Recebi o pagamento {}", payment);
    }
}