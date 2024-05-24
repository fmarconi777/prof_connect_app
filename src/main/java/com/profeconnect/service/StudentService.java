package com.profeconnect.service;

import org.springframework.stereotype.Service;

import com.profeconnect.domain.entity.User;
import com.profeconnect.dto.StudentDTO;

@Service
public class StudentService {
    public User signupStudent(User user) {
        User usuraio = new User();
        return usuraio;
    }

    public User fromDTO(StudentDTO student) {
        User user = new User();
        return user;
    }
}
