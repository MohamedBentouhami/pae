package com.example.demo.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Course;

@Service
public class PAE {

    public List<Course> getCourses() {
        return new ArrayList<>(List.of(new Course("INT1", "Introductions", 10), new Course("MAT1", "Mathématiques", 3),
                new Course("DEV1", "Développement 1", 10), new Course("CAI1", "Anglais 1", 2)));
    }
}
