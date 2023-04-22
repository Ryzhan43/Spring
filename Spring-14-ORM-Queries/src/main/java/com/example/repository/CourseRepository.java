package com.example.repository;

import com.example.entity.Course;
import jakarta.annotation.security.PermitAll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course, Long> {

    //find all courses by category
    List<Course> findByCategory(String category);

    //Find aa courses by category and order the entity by name
    List<Course> findByCategoryOrderByName(String category);

    //checks if the course with provided name exists. return true if course exist, false otherwise
    boolean existsByName(String name);

    //returns the counts of courses for the provided categories
    int countAllByCategory(String name);

    //find all courses that starts with the provided course name
    List<Course> findByNameStartingWith(String name);

    //find all courses by category and return a stream
    Stream<Course> streamAllByCategory(String name);

    @Query("SELECT c FROM Course c WHERE (c.category LIKE :category) AND (c.rating > :rating)")
    List<Course> findAllByCategoryAndRatingGreaterThan(@Param("category") String category,@Param("rating") int rating);



}
