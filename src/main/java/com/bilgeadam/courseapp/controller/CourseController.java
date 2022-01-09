package com.bilgeadam.courseapp.controller;

import com.bilgeadam.courseapp.entity.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getCourses() {

        List<Course> courseList = new ArrayList();

        Course course1 = new Course("MAT101","Matematiğe Giriş","Cahit Arf");
        Course course2 = new Course("COG101","Coğrafyaya Giriş","Evliya Çelebi");
        Course course3 = new Course("TAR101","Tarihe Giriş","Halil İnalcık");

        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);

        return courseList;
    }
}
