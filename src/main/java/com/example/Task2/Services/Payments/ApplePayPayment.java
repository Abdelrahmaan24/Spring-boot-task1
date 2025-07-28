package com.example.Task2.Services.Payments;

import org.springframework.stereotype.Component;

@Component("ApplePay")
public class ApplePayPayment implements Payment {

    @Override
    public String pay(int accNumber) {
        return "Customer No: " + accNumber + " will pay with --> Apple Payment";
    }
}
