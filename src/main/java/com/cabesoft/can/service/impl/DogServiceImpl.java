package com.cabesoft.can.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabesoft.can.dao.DogDaoImpl;
import com.cabesoft.can.model.Dog;
import com.cabesoft.can.service.DogService;

@Service
public class DogServiceImpl implements DogService {
	@Autowired
	private DogDaoImpl dao;

	@Override
	public void addDog(Dog dog) {
		this.dao.save(dog);
	}

	@Override
	public List<Dog> list() {
		return this.dao.findAll();
	}

}
