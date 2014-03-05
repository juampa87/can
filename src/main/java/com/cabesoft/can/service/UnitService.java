package com.cabesoft.can.service;

import java.util.List;

import com.cabesoft.can.model.Unit;

public interface UnitService {

	void addUnit(Unit unit);

	List<Unit> list();

	List<String> validate(Unit unit);

	Unit findUnit(Integer oid);
}
