package com.ebit.xapistatement.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebit.xapistatement.dto.WeatherDto;
import com.ebit.xapistatement.model.Weather;
import com.ebit.xapistatement.repository.WeatherRepository;
import com.ebit.xapistatement.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {
	
	@Autowired WeatherRepository weatherRepository;

	@Override
	public Optional<Weather> findByWeatherId(Integer wid) {
		
		return Optional.ofNullable(weatherRepository.findOne(wid));
	}

	@Override
	public List<Weather> findAllRecodrs() {
		return weatherRepository.findAll();
	}

	@Override
	public List<Weather> findByWeatherName(String wname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addtoWeather(WeatherDto w) {
		Weather w1 =new Weather();
		w1.setId(12l);
		w1.setWId(w.getWId());
		w1.setWeatherPresentName(w.getWeatherPresentName());
		weatherRepository.save(w1);
		System.out.println("hellooo");
	}

	
	
	
}
