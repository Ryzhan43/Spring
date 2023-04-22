package com.example.bootstrap;

import com.example.repository.CourseRepository;
import com.example.repository.DepartmentRepository;
import com.example.repository.EmployeeRepository;
import com.example.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGeneration implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final CourseRepository courseRepository;

    public DataGeneration(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("=========================== REGION START ===================");

        System.out.println(regionRepository.findByCountry("Canada"));
        System.out.println(regionRepository.findDistinctByCountry("Canada"));
        System.out.println(regionRepository.findByCountryContaining("United"));
        System.out.println(regionRepository.findAllByCountryContainingOrderByRegion("United"));

        System.out.println("===========================  END  ===================");

        System.out.println("=========================== DEPARTMENT START ===================");

        System.out.println(departmentRepository.findByDepartment("Toys"));
        System.out.println(departmentRepository.findByDivision("Kids"));
        System.out.println(departmentRepository.findDistinctTop3ByDivisionContains("Hea"));

        System.out.println("===========================  DEPARTMENT END  ===================");


        System.out.println("=========================== EMPLOYEE START ===================");

        System.out.println(employeeRepository.getEmployeeSalary("sdubber7@t-online.de"));

        System.out.println("=========================== EMPLOYEE END  ===================");

        System.out.println("=========================== COURSE START ===================");

        courseRepository.findByCategory("Spring").forEach(System.out::println);
        courseRepository.findByCategory("Spring").forEach(System.out::println);
        System.out.println(courseRepository.existsByName("JavaScript for all"));
        courseRepository.findByNameStartingWith("Scalable").forEach(System.out::println);
        courseRepository.streamAllByCategory("Java").forEach(System.out::println);

        System.out.println("=========================== COURSE END  ===================");



    }
}
