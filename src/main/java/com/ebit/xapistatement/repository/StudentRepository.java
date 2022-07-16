package com.ebit.xapistatement.repository;

import org.springframework.stereotype.Repository;

import com.ebit.xapistatement.dao.AbstractJpaDAO;
import com.ebit.xapistatement.model.Student;

@Repository
public class StudentRepository extends AbstractJpaDAO< Student > {

	public StudentRepository() {
		setClazz(Student.class );
	}

	

}
