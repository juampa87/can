package com.cabesoft.can.dao;

import org.springframework.stereotype.Component;

import com.cabesoft.can.model.ClinicHistory;

@Component
public class ClinicHistoryDaoImpl extends
		GenericDaoImpl<ClinicHistory, Integer> {

	@Override
	public Boolean canBeDeleted(Integer id) {
		return true;
	}

	@Override
	protected Class<ClinicHistory> getEntityClass() {
		return ClinicHistory.class;
	}

}
