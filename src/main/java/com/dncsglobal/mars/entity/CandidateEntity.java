package com.dncsglobal.mars.entity;

import com.dncsglobal.mars.enums.CandidateStatus;
import com.dncsglobal.mars.enums.Priority;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Candidate_Details")
public class CandidateEntity {
    @Id
    @Column(name = "candidate_id")
    private String candidateId;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "resume_Url")
    private String resumeUrl;
    @Column(name = "skills")
    private String skills;
    @Column(name = "experience")
    private Float experience;
    @Column(name = "location")
    private String location;
    @Column(name = "visa")
    private String visa;
    @Column(name = "priority")
    @Enumerated(EnumType.STRING)
    private Priority priority;
    @Column(name = "candidate_status")
    @Enumerated(EnumType.STRING)
    private CandidateStatus status;
    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
