package com.sb.sbbackend.serviceImpl;

import com.sb.sbbackend.model.Employee;
import com.sb.sbbackend.repository.EmplyeeRepository;
import com.sb.sbbackend.service.EmplyeeService;
import org.springframework.stereotype.Service;

@Service
public class EmplyeeServiceImpl implements EmplyeeService {
    private EmplyeeRepository emplyeeRepository;

    public EmplyeeServiceImpl(EmplyeeRepository emplyeeRepository) {
        super();
        this.emplyeeRepository = emplyeeRepository;
    }

    @Override
    public Employee saveEmplyee(Employee employee) {

        return emplyeeRepository.save(employee);
    }
}
