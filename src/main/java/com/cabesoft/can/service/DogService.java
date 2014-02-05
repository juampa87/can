package com.cabesoft.can.service;

import java.util.List;

import com.cabesoft.can.model.Dog;

public interface DogService {

	void addDog(Dog dog);

	List<Dog> list();
}
