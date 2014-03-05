package com.cabesoft.can.dao;

import org.springframework.stereotype.Component;

import com.cabesoft.can.model.Unit;

@Component
public class UnitDaoImpl extends GenericDaoImpl<Unit, Integer> {

	@Override
	public Boolean canBeDeleted(Integer id) {
		return true;
	}

	@Override
	protected Class<Unit> getEntityClass() {
		return Unit.class;
	}

}
