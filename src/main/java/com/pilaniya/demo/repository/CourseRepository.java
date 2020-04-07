package com.pilaniya.demo.repository;

import com.pilaniya.demo.model.Course;
import com.pilaniya.demo.model.Enroll;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
