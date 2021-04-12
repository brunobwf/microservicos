package br.com.hrworker.service;

import java.util.List;

import br.com.hrworker.entity.Worker;

public interface WorkerService {

	List<Worker> listarWorker();
	Worker buscaWorkerPorId(Long id);

}
