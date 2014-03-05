package com.cabesoft.can.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.cabesoft.can.model.enums.CodeType;
import com.cabesoft.can.model.enums.Specialization;

@Entity
public class Dog {
	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	private Date birthdate;

	private String breed;

	private String nickname;

	private Specialization specialization;

	private String code;

	private CodeType codeType;

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "unit")
	private Unit unit;

	private String observation;

	private String picture;

	@OneToMany(cascade = CascadeType.REFRESH)
	private List<ClinicHistory> clinicHistory;

	public Dog() {

	};

	public Dog(String name, Date birthdate, String breed, String nickname,
			Specialization specialization, String code, CodeType codeType,
			Unit unit, String observation, String picture,
			List<ClinicHistory> clinicHistory) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		this.breed = breed;
		this.nickname = nickname;
		this.specialization = specialization;
		this.code = code;
		this.codeType = codeType;
		this.unit = unit;
		this.observation = observation;
		this.picture = picture;
		this.clinicHistory = clinicHistory;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Specialization getSpecialization() {
		return specialization;
	}

	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public CodeType getCodeType() {
		return codeType;
	}

	public void setCodeType(CodeType codeType) {
		this.codeType = codeType;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public List<ClinicHistory> getClinicHistory() {
		return clinicHistory;
	}

	public void setClinicHistory(List<ClinicHistory> clinicHistory) {
		this.clinicHistory = clinicHistory;
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", birthdate=" + birthdate
				+ ", breed=" + breed + ", nickname=" + nickname
				+ ", specialization=" + specialization + ", code=" + code
				+ ", codeType=" + codeType + ", unit=" + unit
				+ ", observation=" + observation + ", picture=" + picture
				+ ", clinicHistory=" + clinicHistory + "]";
	}
}
