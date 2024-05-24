package com.profeconnect.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profeconnect.domain.entity.User;
import com.profeconnect.dto.StudentDTO;
import com.profeconnect.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/app/studentsignup")
public class StudentSignupController {
    private final StudentService studentService;
    public StudentSignupController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<String> signup(@RequestBody @Valid StudentDTO studentDTO) {
        User student = studentService.fromDTO(studentDTO);
        return ResponseEntity.ok("token");
    }
}
