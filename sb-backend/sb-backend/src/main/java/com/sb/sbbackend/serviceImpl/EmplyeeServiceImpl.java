package com.sb.sbbackend.serviceImpl;

import com.sb.sbbackend.exeception.ResourceNotFoundException;
import com.sb.sbbackend.model.Employee;
import com.sb.sbbackend.repository.EmplyeeRepository;
import com.sb.sbbackend.service.EmplyeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmplyeeServiceImpl implements EmplyeeService {
    private EmplyeeRepository emplyeeRepository;

    public EmplyeeServiceImpl(EmplyeeRepository emplyeeRepository) {
        super();
        this.emplyeeRepository = emplyeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {

        return emplyeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return emplyeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> employee = emplyeeRepository.findById(id);
        if(employee.isPresent()){
            return employee.get();
        }else{
            throw  new ResourceNotFoundException("Employee", "ID", id);
        }
//        return emplyeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Emplyee","ID",id));
    }


}
