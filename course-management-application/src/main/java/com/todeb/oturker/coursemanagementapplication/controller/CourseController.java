package com.todeb.oturker.coursemanagementapplication.controller;


import com.todeb.oturker.coursemanagementapplication.model.Course;
import com.todeb.oturker.coursemanagementapplication.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/all")
    public ResponseEntity getAllCourses(){
        List<Course> allCourses = courseService.getAllCourses();
        return ResponseEntity.ok(allCourses);
    }
    @GetMapping("/{id}") //süslü parantezdeki tanım ile parametre aynıysa pathvariablea gerek yok.
    public ResponseEntity getCourseById(@PathVariable("id") Long id){

        Course byId;
        try {
            byId = courseService.getById(id);
        } catch (RuntimeException exception) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.status(HttpStatus.OK).body(byId);
    }

    @PostMapping("/create")
    public Course createNewCourse(@RequestBody Course course){
        return null;
    }

}
