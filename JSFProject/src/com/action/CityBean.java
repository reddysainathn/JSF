package com.action;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.dao.CityDAO;
import com.vo.City;

@ManagedBean(name = "city")
@SessionScoped
public class CityBean {

	CityDAO cityDAO = new CityDAO();
	private int id;
	private String name;
	private String countrycode;
	private String district;
	private int population;
	private List<City> cityList;

	public List<City> getCityList() {
		return cityList;
	}

	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}

	public CityBean() {

		cityList = fetchAllCities();
	}

	public List<City> fetchAllCities() {

		return cityDAO.getCitys();

	}

	public List<City> getCitysList() {

		return cityList;
	}

	public void addCity() {

		City city = new City(id, name, countrycode, district, population);
		cityDAO.addCity(city);

		//cityList = fetchAllCities();

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
