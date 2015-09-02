package com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// Entity means it is an entity Object.
//Entity Objects means the objects whose state is to permanent storage

@Entity
@Table(name="city")
public class City {

	@Id
	@Column(name="ID")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="CountryCode")
	private String countrycode;
	@Column(name="District")
	private String district;
	@Column(name="Population")
	private int population;

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(int id, String name, String countrycode, String district,
			int population) {
		super();
		this.id = id;
		this.name = name;
		this.countrycode = countrycode;
		this.district = district;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}
