package com.cabesoft.can.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabesoft.can.dao.UnitDaoImpl;
import com.cabesoft.can.model.Unit;
import com.cabesoft.can.service.UnitService;

@Service
public class UnitServiceImpl implements UnitService {
	@Autowired
	private UnitDaoImpl dao;

	@Override
	public void addUnit(Unit unit) {
		this.dao.save(unit);
	}

	@Override
	public List<Unit> list() {
		return this.dao.findAll();
	}

	@Override
	public List<String> validate(Unit unit) {
		// TODO this
		return new ArrayList<String>();
	}

	@Override
	public Unit findUnit(Integer oid) {
		return this.dao.findById(oid);
	}

}
