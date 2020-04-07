package com.pilaniya.demo.service;

import com.pilaniya.demo.model.Enroll;

import java.util.List;
import java.util.Optional;

public interface EnrollService {
    List<Enroll> enrollList();
    Optional<Enroll> findEnroll(Long id);
    Enroll saveEnroll(Enroll enroll);
    List<Enroll> deleteEnroll(Long id);
    List<Enroll> findAllStudentOfInstructor(Long instructorId);
    List<Enroll> findAllCourseOfStudent(Long studentId);
}
