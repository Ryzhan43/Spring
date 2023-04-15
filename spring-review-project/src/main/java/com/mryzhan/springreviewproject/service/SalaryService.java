package com.mryzhan.springreviewproject.service;

import com.mryzhan.springreviewproject.repository.EmployeePerository;
import com.mryzhan.springreviewproject.repository.HoursRepository;
import org.springframework.stereotype.Component;


@Component
public class SalaryService {

    HoursRepository hr;
    EmployeePerository er;
    public SalaryService(HoursRepository hr, EmployeePerository er) {
        this.hr = hr;
        this.er = er;
    }
    void calculateRegularySalary(){

    }
}
