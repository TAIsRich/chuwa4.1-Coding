package com.chuwa.repo;

import com.chuwa.Pojo.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    Optional<Employee> findEmployeeById(Long id);

    Optional<Employee> findEmployeeByLastNameAndFirstName(String lastName,String firstName);

    List<Employee> findAll();

    void deleteEmployeeById(Long id);


    @Query("SELECT e FROM Employee e where e.lastName=: lastName")
    public List<Employee> find(@Param("last_name") String lastName);


    @Query("select e from Employee e where e.title= :title")
    List<Employee> findByTitle(@Param("title") String title);


}
