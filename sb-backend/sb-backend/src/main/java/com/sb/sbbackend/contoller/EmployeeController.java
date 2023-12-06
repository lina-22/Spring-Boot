package com.sb.sbbackend.contoller;

import com.sb.sbbackend.model.Employee;
import com.sb.sbbackend.service.EmplyeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private EmplyeeService emplyeeService;

    public EmployeeController(EmplyeeService emplyeeService) {
        super();
        this.emplyeeService = emplyeeService;
    }

    //build create emplyee REST API
    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
         return new ResponseEntity<>(emplyeeService.saveEmplyee(employee), HttpStatus.CREATED);
    }


RequestEntity
}
