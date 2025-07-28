package com.example.Task2.Services.Payments;

import org.springframework.stereotype.Component;

@Component("Paypal")
public class PayPalPayment implements Payment {

    @Override
    public String pay(int accNumber) {
        return "Customer No: " + accNumber + " will pay with --> PayPal Payment";
    }

}
