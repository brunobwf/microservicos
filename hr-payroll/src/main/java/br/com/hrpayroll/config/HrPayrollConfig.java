package br.com.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HrPayrollConfig {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	
}
