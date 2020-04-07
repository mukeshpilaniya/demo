package com.pilaniya.demo.service;

import com.pilaniya.demo.model.Enroll;
import com.pilaniya.demo.repository.EnrollRepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollServiceImpl implements EnrollService {

    @Autowired
    private EnrollRepository enrollRepository;

    //list's all enrolls
    public List<Enroll> enrollList(){
        return enrollRepository.findAll();
    }
    //find specific enroll info
    public Optional<Enroll> findEnroll(Long id){
        return  enrollRepository.findById(id);
    }
    //save enroll info
    public Enroll saveEnroll(Enroll enroll){
        return enrollRepository.save(enroll);
    }
    //delete enroll
    public List<Enroll> deleteEnroll(Long id){
        enrollRepository.deleteById(id);
        return enrollRepository.findAll();
    }
    //find all courses of student
    public List<Enroll> findAllCourseOfStudent(Long studentId){
        return enrollRepository.findByStudentId(studentId);
    }
    //find all students of Instructor
    public List<Enroll> findAllStudentOfInstructor(Long instructorId){
        return enrollRepository.findByCourseInstructorId(instructorId);
    }
}
