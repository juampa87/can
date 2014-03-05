package com.cabesoft.can.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Unit {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	private String location;

	public Unit(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public Unit() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return this.name + " - " + this.location;
	}

}
