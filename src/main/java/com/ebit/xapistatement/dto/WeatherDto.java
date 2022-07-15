package com.ebit.xapistatement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
public class WeatherDto {
	
	private Integer wId;
	private String weatherPresentName;
	public WeatherDto(int wId, String weatherPresentName) {
		super();
		this.wId = wId;
		this.weatherPresentName = weatherPresentName;
	}
	
	
}
