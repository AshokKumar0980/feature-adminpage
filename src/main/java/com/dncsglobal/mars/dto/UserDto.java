package com.dncsglobal.mars.dto;

import com.dncsglobal.mars.enums.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class UserDto {
    private String userId;
    private String username;
    private String emailId;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
}
