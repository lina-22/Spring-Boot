package com.sb.sbbackend.service;

import com.sb.sbbackend.model.Employee;

import java.util.List;

public interface EmplyeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(long id);
}
