package com.ebit.xapistatement.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebit.xapistatement.dto.StudentDto;
import com.ebit.xapistatement.model.Student;
import com.ebit.xapistatement.repository.StudentRepository;
import com.ebit.xapistatement.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired StudentRepository studentRepository;

	@Override
	public Optional<Student> findById(Integer id) {
		return Optional.ofNullable(studentRepository.findOne(id));
	}

	@Override
	public List<Student> findAllRecodrs() {
		return studentRepository.findAll();
	}

	@Override
	public List<Student> findBySName(String sname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addtoStudent(StudentDto w) {
		Student student  = new Student();
		student.setId(w.getId());
		student.setSname(w.getSname());
		studentRepository.save(student);
	}

	

	
	
	
}
