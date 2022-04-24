package com.chuwa.repo;

import com.chuwa.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

   Optional<Employee> findEmployeeById(Long id);

    void deleteEmployeeById(Long id);
}
