package com.cabesoft.can.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cabesoft.can.dao.ClinicHistoryDaoImpl;
import com.cabesoft.can.dao.DogDaoImpl;
import com.cabesoft.can.model.ClinicHistory;
import com.cabesoft.can.model.Dog;
import com.cabesoft.can.service.DogService;

@Service
public class DogServiceImpl implements DogService {
	@Autowired
	private DogDaoImpl dao;
	@Autowired
	private ClinicHistoryDaoImpl clinicDao;

	@Override
	public Dog getDog(Integer id) {
		return this.dao.findById(id);
	}

	@Override
	public void addDog(Dog dog) {
		this.dao.save(dog);
	}

	@Override
	public List<Dog> list() {
		List<Dog> dogs = this.dao.findAll();
		return dogs;
	}

	@Override
	@Transactional
	public void removeDog(Integer id) {
		Dog dog = this.getDog(id);
		this.dao.delete(dog);
	}

	@Override
	@Transactional
	public void addClinicHistory(ClinicHistory clinicHistory, Integer dogId) {
		Dog dog = this.dao.findById(dogId);
		dog.getClinicHistory().add(clinicHistory);
		this.dao.saveOrUpdate(dog);
	}

	@Override
	@Transactional
	public void removeClinicHistory(Integer clinicHistoryId, Integer dogId) {
		Dog dog = this.dao.findById(dogId);
		List<ClinicHistory> filtered = new ArrayList<ClinicHistory>();
		for (ClinicHistory history : dog.getClinicHistory()) {
			if (!history.getId().equals(clinicHistoryId)) {
				filtered.add(history);
			}
		}
		dog.setClinicHistory(filtered);
		this.dao.saveOrUpdate(dog);
	}

}
