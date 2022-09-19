package com.test.coursesservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.coursesservices.entities.Course;

public interface CourseDao extends JpaRepository<Course,Long>{

}
