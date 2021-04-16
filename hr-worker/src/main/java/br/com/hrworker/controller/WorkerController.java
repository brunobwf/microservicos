package br.com.hrworker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hrworker.entity.Worker;
import br.com.hrworker.service.impl.WorkerServiceImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "workers")
public class WorkerController {

	@Autowired
	private Environment env;  
	
	@Autowired
	private WorkerServiceImpl workerService;

	@GetMapping
	public ResponseEntity<List<Worker>> listarWorker() {
		try {
			List<Worker> bodyResponse = workerService.listarWorker();
			return ResponseEntity.ok(bodyResponse);
		} catch (Exception e) {
			return new ResponseEntity<List<Worker>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> buscaWorkerPorId(@PathVariable Long id) {
		log.info("PORT="+env.getProperty("local.server.port"));
			Worker bodyResponse = workerService.buscaWorkerPorId(id);
			return ResponseEntity.ok(bodyResponse);
	}

}
