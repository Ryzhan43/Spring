package com.mryzhan.springreviewproject.repository;

import com.mryzhan.springreviewproject.model.Employee;

public class DBEmployeeRepository implements EmployeePerository{

    Employee emp1;
    @Override
    public int getHourlyRate() {
        return emp1.getHourlyRate();
    }
}
