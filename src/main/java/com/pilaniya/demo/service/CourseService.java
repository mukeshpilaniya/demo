package com.pilaniya.demo.service;

import com.pilaniya.demo.model.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    List<Course> courseList();
    Optional<Course> findCourse(Long id);
    Course saveCourse(Course course);
    List<Course> deleteCourse(Long id);
    List<Course> updateCourse(Course course);
}
