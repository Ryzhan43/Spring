package com.example.repository;

import com.example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findAllByEmail(String email);

    //Display aa employee with first name and the last name, also show employee with an email address
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    //Display aa employees that first name is not ''
    List<Employee> findByFirstNameIsNot(String firstName);

    //Display all employees last name starts with ''
    List<Employee> findByLastNameStartingWith(String patter);

    //Display all employees with salary greater than ''
    List<Employee> findBySalaryGreaterThan(Integer salary);

    //Display all employees with salary less than ''
    List<Employee> findBySalaryLessThan(Integer salary);

    //Display all employees with salary less than or equal''
    List<Employee> findBySalaryLessThanEqual(Integer salary);

    //Display all employees with salary less than ''
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    //Display all employees where salaries greater and equal to '' in order
    List<Employee> findBySalaryIsGreaterThanEqualOrderBySalaryDesc(Integer salary);

    //Display top 3 unique employees that is making less
    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();

    @Query("SELECT e FROM Employee e WHERE e.email=?1")
    Employee getEmployeeDetail(String email);

    @Query("SELECT e.salary FROM Employee e WHERE e.email=?1")
    Integer getEmployeeSalary(String email);

    @Query("SELECT e FROM Employee e WHERE e.email=?1 and e.salary=?2")
    Employee getEmployeeDetail(String email, int salary);
}
