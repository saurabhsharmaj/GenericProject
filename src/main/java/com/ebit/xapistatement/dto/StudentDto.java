package com.ebit.xapistatement.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@Getter
@Setter
public class StudentDto {
	
	private Integer id;
	private String sname;
	public StudentDto(int id, String sname) {
		super();
		this.id = id;
		this.sname = sname;
	}
	
	
}
