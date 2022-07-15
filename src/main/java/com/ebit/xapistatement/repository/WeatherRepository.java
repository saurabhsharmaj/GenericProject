package com.ebit.xapistatement.repository;

import org.springframework.stereotype.Repository;

import com.ebit.xapistatement.dao.BasicDao;
//import com.ebit.xapistatement.dao.WeatherBaseDao;
import com.ebit.xapistatement.model.Weather;

@Repository
public class WeatherRepository extends BasicDao<Weather, Integer> {

	public WeatherRepository() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
