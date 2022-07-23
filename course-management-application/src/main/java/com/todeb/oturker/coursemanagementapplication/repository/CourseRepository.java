package com.todeb.oturker.coursemanagementapplication.repository;

import com.todeb.oturker.coursemanagementapplication.model.Course;
import com.todeb.oturker.coursemanagementapplication.model.LangOptions;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class CourseRepository {

    private List<Course> courseList = new ArrayList<>();

    {
        List<String> sampleJavaKeywords = new ArrayList<>();
        sampleJavaKeywords.addAll(Arrays.asList("Java","Spring","Boot","AOP"));
        List<LangOptions> sampleJavaCourseLangOptions = new ArrayList<>();
        sampleJavaCourseLangOptions.add(LangOptions.ENGLISH);
        sampleJavaCourseLangOptions.add(LangOptions.TURKISH);


        courseList.add(new Course("Java Programming",
                "Java EE Web Development / Java Core",
                49.99, 1000,0,0,0,sampleJavaKeywords,
                sampleJavaCourseLangOptions,null,null));

        List<String> sampleJavaKeywords2 = new ArrayList<>();
        sampleJavaKeywords2.addAll(Arrays.asList("C++","OOP","Class","Encapsulation"));
        List<LangOptions> sampleJavaCourseLangOptions2 = new ArrayList<>();
        sampleJavaCourseLangOptions2.add(LangOptions.SPANISH);
        sampleJavaCourseLangOptions2.add(LangOptions.GERMAN);
        sampleJavaCourseLangOptions2.add(LangOptions.ENGLISH);


        courseList.add(new Course("Object Orianted Programming",
                "Object Orianted Paradign fundamentals with C++ / Inheritence / Polimorphism",
                149.99, 2000,0,0,0,sampleJavaKeywords2,
                sampleJavaCourseLangOptions2,null,null));
    }
    public List<Course> findAll(){
        return courseList;
    }

    public Optional<Course> getById(Long id){
//        for (Course course : courseList) {
//            if (course.getId()==id)
//                return course;
//        }
        Optional<Course> courseOpt = courseList.stream()
                .filter(course -> course.getId().equals(id)).findFirst();
        return courseOpt;
    }

    public Course create(Course course){
        boolean addStatus = courseList.add(course);
        if(!addStatus){
            return null;
        }
        return course;
    }

}
