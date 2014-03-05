package com.cabesoft.can.service;

import java.util.List;

import com.cabesoft.can.model.ClinicHistory;
import com.cabesoft.can.model.Dog;

public interface DogService {
	Dog getDog(Integer id);

	void addDog(Dog dog);

	List<Dog> list();

	void removeDog(Integer id);

	void addClinicHistory(ClinicHistory clinicHistory, Integer dogId);

	void removeClinicHistory(Integer clinicHistoryId, Integer dogId);
}
