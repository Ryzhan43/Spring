package com.mryzhan.springreviewproject.repository;

import com.mryzhan.springreviewproject.model.Employee;

public class DBEmployeeRepository implements EmployeePerository{


    @Override
    public int getHourlyRate() {
        Employee emp1 = new Employee("Honda", "Hona", 40);
        return emp1.getHourlyRate();
    }
}
