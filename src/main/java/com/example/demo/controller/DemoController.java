package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Worker;
import com.example.demo.repository.WorkerRepository;

@RestController
public class DemoController {

	@Autowired
	WorkerRepository repository;
	public void insertValue() {
		Worker worker = new  Worker();
		worker.setName("ABc");
		worker.setPhone(Long.valueOf(1234567890));
		
		repository.save(worker);
	}

}
