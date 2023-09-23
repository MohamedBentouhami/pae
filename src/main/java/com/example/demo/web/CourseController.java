package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.business.PAE;
import com.example.demo.model.Course;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CourseController {

    @Autowired
    private PAE business;

    public CourseController() {
    }

    @GetMapping("/courses")
    public String getCourses(Model model) {
        model.addAttribute("courses", this.business.getCourses());
        model.addAttribute("course", new Course());
        return "courses";
    }

    @GetMapping("/courses/1")
    public String getDetailCourse(Model model) {
        model.addAttribute("courses", this.business.getCourses());
        return "detail_course";
    }

    @PostMapping("/courses/add")
    public String addCourse(@Valid @ModelAttribute(name = "course") Course course, Errors errors, Model model) {
        if (errors.hasErrors()) {
            log.info("Error");
            log.info(errors.toString());
            model.addAttribute("courses", this.business.getCourses());
            return "courses";
        }
        log.info(course.toString());
        return "redirect:/courses";
    }

}
