package br.com.hrpayroll.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.hrpayroll.dto.WorkerDto;


@Component
//Eureka entrega uma instância do Worker para o FeignClient fazer a chamada do WebService
@FeignClient(name = "hr-worker",path="/workers") //--> Ao utilizar o FeignClients só precisamos chamar o nome do serviço(aplicação) e o path sem necessidade de porta e afins.
public interface WorkerFeignClient {
	
	@GetMapping(value = "/{id}")
	ResponseEntity<WorkerDto> buscaWorkerPorId(@PathVariable Long id);
}
