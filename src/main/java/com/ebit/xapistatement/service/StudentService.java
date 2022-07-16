package com.ebit.xapistatement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ebit.xapistatement.dto.StudentDto;
import com.ebit.xapistatement.model.Student;

public interface StudentService {

	public Optional<Student> findById(Integer id);
	
	public List<Student> findAllRecodrs();
	
	public Page<Student> findAllRecords(Pageable pageable);
	
	public List<Student> findBySName(String sname);
	
	public void addtoStudent(StudentDto w);
}
