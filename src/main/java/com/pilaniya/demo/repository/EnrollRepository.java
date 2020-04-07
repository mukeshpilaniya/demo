package com.pilaniya.demo.repository;

import com.pilaniya.demo.model.Enroll;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EnrollRepository extends JpaRepository<Enroll,Long> {

    List<Enroll> findByCourseInstructorId(Long instructorid);

    List<Enroll> findByStudentId(Long studentid);
}
