package com.cabesoft.can.dao;

import org.springframework.stereotype.Component;

import com.cabesoft.can.model.Dog;

@Component
public class DogDaoImpl extends GenericDaoImpl<Dog, Integer> {

	@Override
	public Boolean canBeDeleted(Integer id) {
		return true;
	}

	@Override
	protected Class<Dog> getEntityClass() {
		return Dog.class;
	}

}
