package com.example.Task2.Services.Payments;

import org.springframework.stereotype.Component;

@Component("Stripe")
public class StripePayment implements Payment {

    @Override
    public String pay(int accNumber) {
        return "Customer No: " + accNumber + " will pay with --> Stripe Payment";
    }
}
