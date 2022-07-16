package com.ebit.xapistatement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebit.xapistatement.dto.WeatherDto;
import com.ebit.xapistatement.model.Weather;
import com.ebit.xapistatement.service.WeatherService;

@RestController
public class WeatherController {

	@Autowired WeatherService weatherService;
	
	//fetch data
	@GetMapping("weather/{wid}")
	public Optional<Weather> getWeatherById(@PathVariable Integer wid){
		return weatherService.findByWeatherId(wid);
	}
	
	@GetMapping("weather")
	public List<Weather> findAllWaether(){
		return weatherService.findAllRecodrs();
	}
	
	@GetMapping("weather/{wname}")
	public List<Weather> findByWName(@PathVariable String wname){
		return weatherService.findByWeatherName(wname);
	}
	
	//add new data

	@PostMapping("/weather")
	public void addNewtoWeather(@RequestBody WeatherDto w) {
		System.out.println(w);
		System.out.println(w.getWId());
		
		weatherService.addtoWeather(w);
	}
}
