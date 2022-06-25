package com.learn.com.learn.web.com.learn.service;

import com.learn.com.learn.web.com.learn.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {


    public List<Employee> getAllEmployees() {
        Employee employee = new Employee();
        employee.setEmpId(101L);
        employee.setFirstName("Ganesh");
        employee.setLastName("Siva");

        Employee employee1 = new Employee();
        employee1.setEmpId(102L);
        employee1.setFirstName("Murugan");
        employee1.setLastName("Siva");

        return Arrays.asList(employee,employee1);

    }
}
