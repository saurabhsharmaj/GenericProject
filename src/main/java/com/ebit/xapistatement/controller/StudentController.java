package com.ebit.xapistatement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebit.xapistatement.dto.StudentDto;
import com.ebit.xapistatement.model.Student;
import com.ebit.xapistatement.service.StudentService;

@RestController
public class StudentController {

	@Autowired StudentService studentService;
	
	//fetch data
	@GetMapping("student/{id}")
	public Optional<Student> getWeatherById(@PathVariable Integer id){
		return studentService.findById(id);
	}
	
	@GetMapping("student")
	public List<Student> findAllStudent(){
		return studentService.findAllRecodrs();
	}
	
	@GetMapping("student/{name}")
	public List<Student> findByName(@PathVariable String wname){
		return studentService.findBySName(wname);
	}
	
	@PostMapping("/student")
	public void addNewtoStudent(@RequestBody StudentDto w) {		
		studentService.addtoStudent(w);
	}
}
