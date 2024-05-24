package com.profeconnect.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profeconnect.dto.StudentDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/app/studentsignup")
public class StudentSignupController {

    @PostMapping
    public ResponseEntity<String> signup(@RequestBody @Valid StudentDTO studentDTO) {
        return ResponseEntity.ok("token");
    }
}
