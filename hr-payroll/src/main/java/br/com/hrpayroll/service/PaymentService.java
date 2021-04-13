package br.com.hrpayroll.service;

import br.com.hrpayroll.entity.Payment;

public interface PaymentService {

	Payment getPayment(Long workerId, Integer days);

}
