package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.business.PAE;

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
        log.debug("Course Size", this.business.getCourses().size());
        model.addAttribute("courses", business.getCourses());
        return "courses";
    }
    
}
