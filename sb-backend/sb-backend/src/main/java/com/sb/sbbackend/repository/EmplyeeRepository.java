package com.sb.sbbackend.repository;

import com.sb.sbbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmplyeeRepository extends JpaRepository<Employee, Long> {

}
