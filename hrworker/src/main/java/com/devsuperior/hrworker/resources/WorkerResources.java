package com.devsuperior.hrworker.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResources {

	private static Logger logger = LoggerFactory.getLogger(WorkerResources.class);
	
	@Autowired
	private WorkerRepository workerRepository;
	
	@Autowired
	private Environment environment;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> workes = workerRepository.findAll();
		return ResponseEntity.ok(workes);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {
		logger.info("PORT: " + environment.getProperty("local.server.port"));
		
		Worker worker = workerRepository.findById(id).get();
		return ResponseEntity.ok(worker);
	}
}