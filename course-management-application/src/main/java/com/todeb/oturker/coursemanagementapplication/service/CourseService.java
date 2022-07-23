package com.todeb.oturker.coursemanagementapplication.service;

import com.todeb.oturker.coursemanagementapplication.model.Course;
import com.todeb.oturker.coursemanagementapplication.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
//hoca burada nasıl inject edeceğiz diye sordu fakat burayı anlamadım. Bunu neden yapıyoruz?
// (Dependency yi nasıl inject edeceğiz diye sordu, kaç yolu var dedi?)
    //3 ways of Dependency Injection

    //Field injection
    @Autowired
    private CourseRepository courseRepository;

    // Constructor injection
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
//    //Setter injection
//    public void setCourseRepository(CourseRepository courseRepository) {
//        this.courseRepository = courseRepository;
//    }

    public List<Course> getAllCourses(){
        List<Course> allCourses = courseRepository.findAll();
        return allCourses;
    }

    public Course getById(Long id){
        Optional<Course> byId = courseRepository.getById(id);
        return byId.orElseThrow(()-> new RuntimeException("Course not found"));
    }
}
