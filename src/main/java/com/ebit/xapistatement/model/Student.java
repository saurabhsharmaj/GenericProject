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
@Table(name="student")
public class Student extends BaseModel implements Serializable{

		
	
	@Column(name= "s_name")
	private String sname;
}
