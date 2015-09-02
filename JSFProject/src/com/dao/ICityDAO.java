package com.dao;

import java.util.List;

import com.vo.City;
public interface ICityDAO {
	
	public void addCity(City city);
	
	public City getCityById(int id);
	
	public List<City> getCitys();
	
	public void updateCity(City city);
	
	public void deleteCity(int id);
}
