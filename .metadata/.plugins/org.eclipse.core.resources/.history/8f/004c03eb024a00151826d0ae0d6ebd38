package com.action;


import com.opensymphony.xwork2.ActionSupport;
import com.vo.City;
import com.dao.CityDAO;
import com.dao.ICityDAO;

public class CityAction extends ActionSupport {

	private int  cityId;
	
	private ICityDAO cityDAO;
	
	private City city;

	public CityAction() {

	cityDAO = new CityDAO();
		
	}
	@Override
	public String execute() throws Exception {

		city = cityDAO.getCityById(cityId) ;
		
		return "success";
	}
public City getCity() {
	return city;
}
	

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

}
