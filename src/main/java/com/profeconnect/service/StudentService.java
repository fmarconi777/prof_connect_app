package com.profeconnect.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.profeconnect.domain.entity.Role;
import com.profeconnect.domain.entity.User;
import com.profeconnect.dto.StudentDTO;
import com.profeconnect.repository.RoleRepository;

@Service
public class StudentService {    
    private final RoleRepository roleRepository;
    
    public StudentService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public User signupStudent(User user) {
        User usuraio = new User();
        return usuraio;
    }

    public User fromDTO(StudentDTO student) {     
        student.passwordCompare();
        Optional<Role> studentRole = roleRepository.findByRolename("student");
        User user = new User(
            student.getName(), 
            student.getPassword(), 
            student.getBirthDate(), 
            student.getEmail(), 
            student.getSex(), 
            student.getGuardianName(), 
            student.getCpf(),
            studentRole.get()
            );
        return user;
    }
}
