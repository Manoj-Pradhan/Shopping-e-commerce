package com.example.jazzy_kart.service;

import com.example.jazzy_kart.impl.IPaymentService;
import com.example.jazzy_kart.model.Payment;
import com.example.jazzy_kart.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService implements IPaymentService {

    @Autowired
    private PaymentRepository paymentRepository;


    @Override
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }

//    public Payment updatePayment(Long id, Payment paymentDetails) {
//        return paymentRepository.findAllById(id)
//                .stream().map(payment -> {
//                    payment.setId(paymentDetails.getId());
//                    payment.setPaymentType(paymentDetails.getPaymentType());
//                    payment.setCardNumber(paymentDetails.getCardNumber());
//                    payment.setCvv(paymentDetails.getCvv());
//                    return paymentRepository.save(payment);
//                })
//                .orElse(null);
//    }

    @Override
    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }
}
