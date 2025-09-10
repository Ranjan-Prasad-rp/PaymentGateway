package com.example.paymentgateway.Controller;
import com.example.paymentgateway.Entity.PaymentOrder;
import com.example.paymentgateway.Service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

@PostMapping("/create-order")
    public ResponseEntity<String> PaymentOrder(@RequestBody PaymentOrder paymentOrder){

        try {
           String orderDetails =  paymentService.createOrder(paymentOrder);;
              return ResponseEntity.ok(orderDetails);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.status(500).body("Error creating payment order: " + e.getMessage());
        }

    }
    @PostMapping("/update-status")
    public ResponseEntity<String> updatePaymentStatus(@RequestParam String paymentId,
                                                      @RequestParam String orderId,@RequestParam String status){
        paymentService.updatePaymentStatus(paymentId, orderId,status);
        return ResponseEntity.ok("Payment Status Updated and Email Sent Successfully");
    }
}
