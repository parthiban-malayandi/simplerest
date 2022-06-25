package com.learn.com.learn.web;

import com.learn.com.learn.web.com.learn.model.Employee;
import com.learn.com.learn.web.com.learn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping({"/","/test"})
    public String greet(){
        return "Hello Success !!!";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/employees")
    public ResponseEntity<List<Employee>> getEmployees(){
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAllEmployees());
    }

}
