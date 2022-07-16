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
	
	private Long wId;
	private String weatherPresentName;
	public WeatherDto(Long wId, String weatherPresentName) {
		super();
		this.wId = wId;
		this.weatherPresentName = weatherPresentName;
	}
	
	
}
