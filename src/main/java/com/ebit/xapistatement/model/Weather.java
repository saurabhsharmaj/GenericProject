package com.ebit.xapistatement.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="weather")
public class Weather extends BaseModel implements Serializable{

		
	@Column(name= "w_id")
	private Long wId;
	
	@Column(name= "weather_present_name")
	private String weatherPresentName;
}
