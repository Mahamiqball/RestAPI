package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {

	
	List<Course> list;
	public CourseServiceimpl() {
		
		list = new ArrayList<>();
		list.add(new Course(145,"Java Core Course","This course contains basics of Java"));
		list.add(new Course(146,"Spring Boot Course","Creating rest api using SPRING BOOT"));
	}
	
	@Override
	public List<Course> getCourses() {
		
		return list;
	}
	
	@Override
	public Course getCourse(long courseId) {
		
		Course c = null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		
		return c;
	}
	
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}
