package com.cabesoft.can.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cabesoft.can.model.Unit;
import com.cabesoft.can.model.reqres.DataTableResponse;
import com.cabesoft.can.service.UnitService;

@Controller
@RequestMapping("/units")
public class UnitController {
	private static Logger LOGGER = LoggerFactory
			.getLogger(UnitController.class);

	@Autowired
	private UnitService unitService;

	@RequestMapping(value = "/addForm", method = RequestMethod.GET)
	public ModelAndView addUnit() {
		ModelAndView mav = new ModelAndView("add-unit");
		return mav;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addUnit(@RequestParam String name,
			@RequestParam String location) {
		ModelAndView mav = new ModelAndView("units");
		Unit unit = new Unit(name, location);
		List<String> errors = this.unitService.validate(unit);
		if (errors.size() != 0) {
			return new ModelAndView("add-unit");
		}
		this.unitService.addUnit(unit);
		List<Unit> units = this.unitService.list();
		mav.addObject("unitList", units);
		return mav;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView mav = new ModelAndView("units");
		return mav;
	}

	@RequestMapping(value = "/json/list", method = RequestMethod.GET)
	public @ResponseBody
	DataTableResponse<Unit> getClinicHistory() {
		List<Unit> list = this.unitService.list();
		return new DataTableResponse<Unit>(list);
	}

}
