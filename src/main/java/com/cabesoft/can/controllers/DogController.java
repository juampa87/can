package com.cabesoft.can.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cabesoft.can.model.Dog;
import com.cabesoft.can.model.Unit;
import com.cabesoft.can.model.enums.CodeType;
import com.cabesoft.can.model.enums.Specialization;
import com.cabesoft.can.service.DogService;

@Controller
@RequestMapping("/dogs")
public class DogController {
	private static Logger LOGGER = LoggerFactory.getLogger(DogController.class);

	@Autowired
	private DogService service;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public void add() {
		Dog dog = new Dog();
		dog.setBirthdate(new Date());
		dog.setBreed("Labrador");
		List<String> history = new ArrayList<String>();
		history.add("histo1");
		history.add("histo2");
		dog.setClinicHistory(history);
		dog.setCode("123");
		dog.setCodeType(CodeType.POA);
		dog.setName("Ayudante de Santa");
		dog.setNickname("Huesos");
		dog.setObservation("El perro de Bart");
		dog.setSpecialization(Specialization.TRAIL);
		Unit unit = new Unit();
		unit.setName("unidad2");
		dog.setUnit(unit);

		this.service.addDog(dog);
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("dogs");
		List<Dog> dogs = this.service.list();
		for (Dog dog : dogs) {
			LOGGER.debug(dog.toString());
		}
		mav.addObject("size", dogs.size());
		return mav;
	}

}
