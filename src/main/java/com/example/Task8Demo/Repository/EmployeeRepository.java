package com.example.Task8Demo.Repository;

import com.example.Task8Demo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Query("SELECT e FROM Employee e WHERE e.isActive = true")
    List<Employee> getAll();

    @Query("SELECT e FROM Employee e WHERE e.id=:id AND e.isActive = true")
    Employee getById(@Param(value = "id") Integer id);
}
