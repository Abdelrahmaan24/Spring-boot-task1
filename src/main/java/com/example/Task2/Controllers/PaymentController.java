package com.example.Task2.Controllers;

import com.example.Task2.Services.Payments.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    private ApplicationContext context;

    @PostMapping
    public String PaymentProcess(@RequestParam int accNumber, @RequestParam String paymentMethod) {

        try {
            Payment paymentService = (Payment) context.getBean(paymentMethod);
            return paymentService.pay(accNumber);
        }catch (Exception e){
            return "Payment method not supported: " + paymentMethod;
        }
    }

}
