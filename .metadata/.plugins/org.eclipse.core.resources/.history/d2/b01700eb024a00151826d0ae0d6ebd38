package com.action;

import java.util.List;

import com.dao.CityDAO;
import com.dao.ICityDAO;
import com.opensymphony.xwork2.ActionSupport;
import com.vo.City;

public class AllCitiesAction extends ActionSupport {

	private ICityDAO cityDAO;
	List<City> citys;

	public AllCitiesAction() {
		cityDAO = new CityDAO();
	}

	@Override
	public String execute() throws Exception {
		citys = cityDAO.getCitys();
		return "success";
	}

	public List<City> getCitys() {
		return citys;
	}

	
}
