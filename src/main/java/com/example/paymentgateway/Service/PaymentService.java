package com.example.paymentgateway.Service;


import com.example.paymentgateway.Entity.PaymentOrder;
import com.example.paymentgateway.Repository.PaymentRepo;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.lang.annotation.Target;
import java.util.UUID;

@Service
public class PaymentService {
    @Autowired
    private EmailService emailService;
    @Autowired
    private PaymentRepo paymentRepo;




    @Value("${razorpay.key_id}")
    private String keyId;
    @Value("${razorpay.key_secret}")
    private String keySecret;


    public String createOrder(PaymentOrder paymentOrder) throws RazorpayException {
        RazorpayClient razorpayClient = new RazorpayClient(keyId, keySecret);
        // Logic to create order using RazorpayClient and handle paymentOrder details


        // Create order in Razorpay
        JSONObject orderRequest = new JSONObject();
        System.out.print(paymentOrder.getAmount());
        orderRequest.put("amount", paymentOrder.getAmount() * 100);
        System.out.print(paymentOrder.getAmount());
        orderRequest.put("currency", "INR");
        orderRequest.put("receipt", UUID.randomUUID().toString());
        orderRequest.put("payment_capture", 1); // auto capture
        Order order = razorpayClient.orders.create(orderRequest);
        // this  order return order object which contains order id and payment id
        // Save order details in your database
        paymentOrder.setOrderId(order.get("id"));
        paymentOrder.setPaymentId(order.get("payment_id"));
        paymentOrder.setStatus("CREATED");
        paymentRepo.save(paymentOrder);
        return order.toString();
    }

    public void updatePaymentStatus(String paymentId, String orderId, String status) {
        PaymentOrder paymentOrder = paymentRepo.findByOrderId(orderId);
            paymentOrder.setPaymentId(paymentId);
            paymentOrder.setStatus(status);
            paymentRepo.save(paymentOrder);

            if("SUCCESS".equalsIgnoreCase(status)){
                // Send email notification

                emailService.sendEmail(paymentOrder.getEmail(), paymentOrder.getName(), paymentOrder.getAmount());
            }


    }
}
