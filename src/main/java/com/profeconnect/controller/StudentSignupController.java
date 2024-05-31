package com.profeconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profeconnect.domain.entity.User;
import com.profeconnect.dto.StudentDTO;
import com.profeconnect.service.AuthenticationService;
import com.profeconnect.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/app/studentsignup")
public class StudentSignupController {
    private final StudentService studentService;
    private final AuthenticationService authenticationService;

    @Autowired
    public StudentSignupController(StudentService studentService, AuthenticationService authenticationService) {
        this.studentService = studentService;
        this.authenticationService = authenticationService;
    }

    @PostMapping
    public ResponseEntity<String> signup(@RequestBody @Valid StudentDTO studentDTO) {
        User student = studentService.fromDTO(studentDTO);
        student = studentService.signupStudent(student);
        String token = authenticationService.auth(student.getEmail(), student.getPassword());
        return ResponseEntity.ok(token);
    }
}
