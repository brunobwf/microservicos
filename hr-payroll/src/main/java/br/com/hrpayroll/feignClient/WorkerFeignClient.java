package br.com.hrpayroll.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.hrpayroll.dto.WorkerDto;


@Component
@FeignClient(name = "hr-worker",url = "http://localhost:8001",path="/workers")
public interface WorkerFeignClient {
	
	@GetMapping(value = "/{id}")
	ResponseEntity<WorkerDto> buscaWorkerPorId(@PathVariable Long id);
}
