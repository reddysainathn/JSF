package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.util.HibernateUtil;
import com.vo.City;

public class CityDAO extends BaseDAO implements ICityDAO {

	@Override
	public void addCity(City city) {

		
	}
	@Override
	public City getCityById(int id) {
		
		
		Session session =  HibernateUtil.getSessionFactroy().openSession();
		
		City city  = (City) session.get(City.class,id);
		
		return city;
		
	}

	@Override
	public List<City> getCitys() {
		
		Session session =  HibernateUtil.getSessionFactroy().openSession();
		
		Query query = session.createQuery("from City");
		
		return query.list();

	
	}

	@Override
	public void updateCity(City city) {

		
	}

	@Override
	public void deleteCity(int id) {

		
	}
	
public void getCityByName(String name) {
	
	}
}
