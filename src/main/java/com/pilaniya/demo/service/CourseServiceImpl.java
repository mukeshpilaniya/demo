package com.pilaniya.demo.service;

import com.pilaniya.demo.model.Course;
import com.pilaniya.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    //fetch all course
    public List<Course>  courseList(){
        return courseRepository.findAll();
    }
    //find specific course
    public Optional<Course> findCourse(Long id){
        return  courseRepository.findById(id);
    }
    //save course info
    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }
    //update course info
    public  List<Course> updateCourse(Course course){
        courseRepository.save(course);
        return  courseRepository.findAll();
    }
    //delete course
    public List<Course> deleteCourse(Long id){
        courseRepository.deleteById(id);
        return courseRepository.findAll();
    }
}
