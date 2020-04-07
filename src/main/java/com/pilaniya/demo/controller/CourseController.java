package com.pilaniya.demo.controller;

import com.pilaniya.demo.model.Course;
import com.pilaniya.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping(value = "/courses")
    public  List<Course> courseList(){
        return courseService.courseList();
    }
    @GetMapping(value = "/courses/{id}")
    public Optional<Course> findCourse(@PathVariable Long id){
        return courseService.findCourse(id);
    }
    @PostMapping(value = "/courses")
    public Course saveCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }
    @DeleteMapping(value = "/courses/{id}")
    public List<Course> deleteCourse(@PathVariable Long id){
        return courseService.deleteCourse(id);
    }
    @PutMapping(value = "/courses/{id}")
    public List<Course> updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }
}
