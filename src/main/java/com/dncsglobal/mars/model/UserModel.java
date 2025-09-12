package com.dncsglobal.mars.model;

import com.dncsglobal.mars.enums.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private String userId;
    private String username;
    private String emailId;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
    private LocalDateTime created_at;
}

