package com.test.coursesservices.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.coursesservices.dao.CourseDao;
import com.test.coursesservices.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	//List<Course> list;
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
		
//		list=new ArrayList<>();
//		list.add(new Course(1,"Java","Basic Java"));
//		list.add(new Course(2,"Spring Boot","Basic Spring Boot"));
	
	}
	
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//			
//		}
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {

//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {

//		long cId=course.getId();
//		Course c=null;
//		for(Course trav:list) {
//			if(trav.getId()==cId) {
//				trav.setTitle(course.getTitle());
//				trav.setDescription(course.getDescription());
//				break;
//			}
//		}
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//			
//		}
//		this.list.remove(c);
		Course entity=courseDao.getOne(courseId);
		courseDao.delete(entity);
		//return c;
	}


}
