package com.example.repository;

import com.example.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, String> {

    List<Department> findByDepartment(String department);
    List<Department> findByDivision(String division);
    List<Department> findByDivisionIs(String division);

    //Display top 3 departments with devision includes "Hea", not repeating
    List<Department> findDistinctTop3ByDivisionContains(String pattern);

}
