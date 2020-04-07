package com.pilaniya.demo.controller;

import com.pilaniya.demo.model.Course;
import com.pilaniya.demo.model.Enroll;
import com.pilaniya.demo.model.User;
import com.pilaniya.demo.service.EnrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/v1")
public class EnrollController {

    @Autowired
    private EnrollService enrollService;
    @GetMapping("/enroll")
    public List<Enroll> enrollList(){
        return enrollService.enrollList();
    }
    @GetMapping("/enroll/{id}")
    public Optional<Enroll> findEnroll(@PathVariable Long id){
        return enrollService.findEnroll(id);
    }

    @PostMapping("/enroll")
    public Enroll saveEnroll(@RequestBody Enroll enroll){
        return enrollService.saveEnroll(enroll);
    }
    @DeleteMapping("/enroll/{id}")
    public List<Enroll> deleteEnroll(@PathVariable Long id){
        return enrollService.deleteEnroll(id);
    }

    @GetMapping("/student/{studentId}")
    public List<Course> findAllCourseOfStudent(@PathVariable Long studentId){
        //System.out.println(enrollService.findAllCourseOfStudent(studentId));
        List<Course> coursesList=enrollService.findAllCourseOfStudent(studentId).stream().map(cs->cs.getCourse()).collect(Collectors.toList());
        return  coursesList;
    }
    @GetMapping("/instructor/{instructorId}")
    public List<User> findAllStudentOfInstructor(@PathVariable Long instructorId){
        //System.out.println(enrollService.findAllStudentOfInstructor(instructorId)   );
        List<User> userList= enrollService.findAllStudentOfInstructor(instructorId).stream().map(cs->cs.getStudent()).collect(Collectors.toList());
        return  userList;
    }
}
