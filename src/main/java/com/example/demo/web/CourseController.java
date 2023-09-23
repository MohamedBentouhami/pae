package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.business.PAE;
import com.example.demo.model.Course;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CourseController {

    private PAE business;
    public CourseController(){
        this.business = new PAE();
    }

    @GetMapping("/courses")
    public String getCourses(Model model){
        model.addAttribute("courses", this.business.getCourses());
        model.addAttribute("course", new Course());
        return "courses";
    }
    @GetMapping("/courses/1")
    public String getDetailCourse(Model model){
        model.addAttribute("courses", this.business.getCourses());
        return "detail_course";
    }
    @PostMapping("/addCourse")
    public String addCourse(Course newCourse){
        log.info(newCourse.toString());
        return "home";
    }
    
}
