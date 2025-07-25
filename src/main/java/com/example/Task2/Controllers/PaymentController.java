package com.example.Task2.Controllers;

import com.example.Task2.Services.Payments.ApplePayPayment;
import com.example.Task2.Services.Payments.PayPalPayment;
import com.example.Task2.Services.Payments.PaymentService;
import com.example.Task2.Services.Payments.StripePayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    PayPalPayment payPalPayment;

    @Autowired
    ApplePayPayment applePayPayment;

    @Autowired
    StripePayment stripePayment;

    @PostMapping
    public String PaymentProcess(@RequestParam int accNumber, @RequestParam String paymentMethod) {

        PaymentService paymentService;

        switch (paymentMethod){
            case "PayPal":
                paymentService = payPalPayment;
                break;
            case "ApplePay":
                paymentService = applePayPayment;
                break;
            case "Stripe":
                paymentService = stripePayment;
                break;
            default:
                return "Payment method not supported: " + paymentMethod;
        }

        return paymentService.pay(accNumber);
    }

}
