package com.ebit.xapistatement.service;

import java.util.List;
import java.util.Optional;

import com.ebit.xapistatement.dto.WeatherDto;
import com.ebit.xapistatement.model.Weather;

public interface WeatherService {

	public Optional<Weather> findByWeatherId(Integer wid);
	
	public List<Weather> findAllRecodrs();
	
	public List<Weather> findByWeatherName(String wname);
	
	public void addtoWeather(WeatherDto w);
}
