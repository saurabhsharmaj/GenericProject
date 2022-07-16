package com.ebit.xapistatement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebit.xapistatement.model.Student;

@RestController
@RequestMapping("/v1/student")
public class StudentV1Controller extends GenericRestController<Student> {

}
