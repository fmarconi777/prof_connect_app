package com.profeconnect.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class StudentDTO {
    private String name;
    private Date birthDate;
    private String email;
    private String sex;
    private String guardianName;
    private String cpf;
    private String password;
    private String passwordConfirmation;

    public StudentDTO() {
        
    }

    public StudentDTO(
            @NotEmpty(message = "Name cannot be empty") 
            String name,
            @NotEmpty(message = "Birth date cannot be empty")
            @DateTimeFormat(pattern = "dd-MM-yyy") 
            Date birthDate, 
            @NotEmpty(message = "E-mail cannot be empty")
            @Email(message = "E-mail is not valid", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$") 
            String email,
            @NotEmpty(message = "Sex cannot be empty")
            String sex,
            @NotEmpty(message = "Guardian name cannot be empty")
            String guardianName,
            @NotEmpty(message = "CPF cannot be empty")
            String cpf,
            @NotEmpty(message = "Password cannot be empty")
            String password,
            @NotEmpty(message = "Password confirmation cannot be empty")
            String passwordConfirmation
            ) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.sex = sex;
        this.guardianName = guardianName;
        this.cpf = cpf;
        this.password = password;
        this.passwordConfirmation = passwordConfirmation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }

    
}
