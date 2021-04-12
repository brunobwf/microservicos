package br.com.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hrworker.entity.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker,Long> {

}
