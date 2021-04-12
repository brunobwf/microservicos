package br.com.hrworker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hrworker.entity.Worker;
import br.com.hrworker.repository.WorkerRepository;
import br.com.hrworker.service.WorkerService;
@Service
public class WorkerServiceImpl implements WorkerService {

	@Autowired
	private WorkerRepository workerRepository;

	@Override
	public List<Worker> listarWorker() {
		List<Worker> response = workerRepository.findAll();
		return response;
	}

	@Override
	public Worker buscaWorkerPorId(Long id) {
		Worker response = workerRepository.findById(id).orElse(null);
		return response;
	}

}
