package com.ebit.xapistatement.repository;

import org.springframework.stereotype.Repository;

import com.ebit.xapistatement.dao.AbstractJpaDAO;
import com.ebit.xapistatement.model.Weather;

@Repository
public class WeatherRepository extends AbstractJpaDAO< Weather > {

	public WeatherRepository() {
		setClazz(Weather.class );
	}

	

}
