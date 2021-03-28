package com.devsuperior.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
