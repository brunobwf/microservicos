package br.com.hrpayroll.service.impl;

import org.springframework.stereotype.Service;

import br.com.hrpayroll.entity.Payment;
import br.com.hrpayroll.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Override
	public Payment getPayment(Long workerId, Integer days) {
		return new Payment("Bob",200.0,days);
	}

}
