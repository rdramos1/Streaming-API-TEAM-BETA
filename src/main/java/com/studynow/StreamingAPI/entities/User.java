package com.studynow.StreamingAPI.entities;

import com.studynow.StreamingAPI.enums.UserRole;

public record User(Long id, String name, String email, String token, UserRole userRole) {
}
