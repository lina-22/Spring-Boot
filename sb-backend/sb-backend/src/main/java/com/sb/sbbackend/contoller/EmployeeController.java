package com.sb.sbbackend.contoller;

import com.sb.sbbackend.model.Employee;
import com.sb.sbbackend.service.EmplyeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmplyeeService emplyeeService;

    public EmployeeController(EmplyeeService emplyeeService) {
        super();
        this.emplyeeService = emplyeeService;
    }

    //build create emplyee REST API
    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
         return new ResponseEntity<>(emplyeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    // build get all employee REST API

    /**
     *
     * @return getAllEmployees
     */
    @GetMapping()
    public List<Employee> getAllEmploes(){
        return emplyeeService.getAllEmployees();
    }

    // build get employee by id REST API
    /**
     *
     * @param emplyeeId
     * @return emplyeeId
     */
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long emplyeeId){
        return new ResponseEntity<Employee>(emplyeeService.getEmployeeById(emplyeeId), HttpStatus.OK);
    }

    // build update employee REST API
    // http://localhost:8080/api/employees/1
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id , @RequestBody Employee employee){
        return new ResponseEntity<Employee>(emplyeeService.updateEmployee(employee,id), HttpStatus.OK);

    }

    //build delete employee restApi

    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteEmployee(@PathVariable("id") long id){
        //delete emplyee from DB
        emplyeeService.deleteEmployee(id);
        return new ResponseEntity<>("Employee deleted successfully!.", HttpStatus.OK);
    }
}
