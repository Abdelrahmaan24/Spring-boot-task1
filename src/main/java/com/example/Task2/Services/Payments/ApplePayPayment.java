package com.example.Task2.Services.Payments;

import org.springframework.stereotype.Component;

@Component
public class ApplePayPayment implements PaymentService{

    @Override
    public String pay(int accNumber) {
        return "Customer No: " + accNumber + " will pay with --> Apple Payment";
    }
}
