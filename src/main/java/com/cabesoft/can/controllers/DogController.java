package com.cabesoft.can.controllers;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cabesoft.can.model.ClinicHistory;
import com.cabesoft.can.model.Dog;
import com.cabesoft.can.model.Unit;
import com.cabesoft.can.model.enums.CodeType;
import com.cabesoft.can.model.enums.Specialization;
import com.cabesoft.can.model.reqres.DataTableResponse;
import com.cabesoft.can.service.DogService;
import com.cabesoft.can.service.UnitService;

@Controller
@RequestMapping("/dogs")
public class DogController {
	private static Logger LOGGER = LoggerFactory.getLogger(DogController.class);

	@Autowired
	private DogService dogsService;
	@Autowired
	private UnitService unitService;

	@RequestMapping(value = "/addForm", method = RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView mav = new ModelAndView("add-dog");
		mav.addObject("specializations", Specialization.values());
		mav.addObject("units", unitService.list());
		return mav;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView add(@RequestParam String code,
			@RequestParam String name, @RequestParam String nickname,
			@RequestParam String breed, @RequestParam String specialization,
			@RequestParam Integer unitId, @RequestParam String birthdate,
			@RequestParam String tatoo, @RequestParam String description,
			@RequestParam String codeType) {
		ModelAndView mav = new ModelAndView("dogs");
		Unit unit = this.unitService.findUnit(unitId);

		Dog dog = new Dog(name, new Date(), breed, nickname,
				Specialization.valueOf(specialization), code,
				CodeType.valueOf(codeType), unit, description, null, null);
		this.dogsService.addDog(dog);
		mav.addObject("dogList", this.dogsService.list());
		mav.addObject("specializations", Specialization.values());
		mav.addObject("units", unitService.list());
		return mav;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView delete(@RequestParam Integer oid) {
		this.dogsService.removeDog(oid);
		ModelAndView mav = new ModelAndView("dogs");
		List<Dog> dogs = this.dogsService.list();
		mav.addObject("dogList", dogs);
		return mav;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("dogs");
		List<Dog> dogs = this.dogsService.list();
		mav.addObject("dogList", dogs);
		return mav;
	}

	@RequestMapping(value = "/clinic-history/{oid}", method = RequestMethod.GET)
	public @ResponseBody
	DataTableResponse<ClinicHistory> getClinicHistory(@PathVariable Integer oid) {
		List<ClinicHistory> list = this.dogsService.getDog(oid)
				.getClinicHistory();

		return new DataTableResponse<ClinicHistory>(list);
	}

	@RequestMapping(value = "/add-clinic-history/{oid}", method = RequestMethod.POST)
	public void addClinicHistory(@PathVariable Integer oid,
			@RequestBody final ClinicHistory clinicHistory) {
		this.dogsService.addClinicHistory(clinicHistory, oid);
	}

	@RequestMapping(value = "/remove-clinic-history/{dogId}/{clinicHistoryId}", method = RequestMethod.GET)
	public void removeClinicHistory(@PathVariable Integer dogId,
			@PathVariable Integer clinicHistoryId) {
		this.dogsService.removeClinicHistory(clinicHistoryId, dogId);
	}

}
