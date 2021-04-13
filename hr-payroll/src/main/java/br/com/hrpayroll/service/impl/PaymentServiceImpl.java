package br.com.hrpayroll.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.hrpayroll.dto.WorkerDto;
import br.com.hrpayroll.entity.Payment;
import br.com.hrpayroll.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Payment getPayment(Long workerId, Integer days) {
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("id",workerId.toString());
		WorkerDto worker = restTemplate.getForObject(workerHost+"/workers/{id}", WorkerDto.class,uriVariables);
		return new Payment(worker.getName(),worker.getDailyIncome(),days);
	}

}
