package com.dncsglobal.mars.entity;

import com.dncsglobal.mars.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="User_Id")
    private String userId;
    @Column(name = "User_Name")
    private String username;
    @Column(name = "email_Id")
    private String emailId;
    @Column(name = "Password")
    private String password;
    @Column(name = "User_Role")
    @Enumerated(EnumType.STRING)
    private Role role;
    @Column(name = "Creation_Time")
    private LocalDateTime created_at;
    @Column(name = "Updated_Time")
    private LocalDateTime updated_at;
}
