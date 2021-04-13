package br.com.hrpayroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hrpayroll.entity.Payment;
import br.com.hrpayroll.service.impl.PaymentServiceImpl;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

	@Autowired
	private PaymentServiceImpl paymentService;
	
	
	@GetMapping(value = "/{workerId}/{days}")
	public ResponseEntity<Payment> folhaDePagamento(@PathVariable Long workerId,@PathVariable Integer days){
		Payment payment = paymentService.getPayment(workerId, days);
		return ResponseEntity.ok(payment);
	}
	
}
