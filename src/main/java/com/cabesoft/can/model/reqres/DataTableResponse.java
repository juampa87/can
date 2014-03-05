package com.cabesoft.can.model.reqres;

import java.util.List;

public class DataTableResponse<T extends Object> {

	private List<T> aaData;

	public DataTableResponse(List<T> aaData) {
		super();
		this.aaData = aaData;
	}

	public List<T> getAaData() {
		return this.aaData;
	}

	public void setAaData(List<T> aaData) {
		this.aaData = aaData;
	}

}
