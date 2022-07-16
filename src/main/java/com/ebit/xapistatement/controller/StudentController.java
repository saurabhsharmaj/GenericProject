package com.ebit.xapistatement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("studentby")
	public List<Student> findAllStudent(@RequestParam Integer pageNo, @RequestParam  Integer pageSize, @RequestParam  String sortBy, @RequestParam  String sortDir){		
        
		Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
                : Sort.by(sortBy).descending();
		
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        
		Page<Student> page= studentService.findAllRecords(pageable);
        return page.getContent();
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
