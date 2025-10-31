package com.studynow.StreamingAPI.entities;

import com.studynow.StreamingAPI.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity(name = "user")
public class User {

    @Id
    private Long id;
    private String name;
    private String email;
    private String token;
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getToken() {
        return token;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
