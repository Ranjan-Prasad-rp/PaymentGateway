package com.example.paymentgateway.Repository;

import com.example.paymentgateway.Entity.PaymentOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<PaymentOrder, Long> {

    PaymentOrder findByOrderId(String orderId);
}
