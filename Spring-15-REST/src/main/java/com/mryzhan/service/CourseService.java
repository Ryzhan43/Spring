package com.mryzhan.service;

import com.mryzhan.dto.CourseDTO;

import java.util.List;

public interface CourseService {

    CourseDTO createCourse(CourseDTO courseDTO);

    CourseDTO getCourseById(long courseId);

    List<CourseDTO> getCoursesByCategory(String category);

    List<CourseDTO> getCourses();

    void updateCourse(Long courseId, CourseDTO courseDTO);

    void deleteCourseById(long courseId);

    void deleteCourses();
}
