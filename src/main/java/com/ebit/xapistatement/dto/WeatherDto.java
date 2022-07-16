package com.ebit.xapistatement.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@Getter
@Setter
public class WeatherDto {
	
	private Integer wId;
	private String weatherPresentName;
	public WeatherDto(int wId, String weatherPresentName) {
		super();
		this.wId = wId;
		this.weatherPresentName = weatherPresentName;
	}
	
	
}
