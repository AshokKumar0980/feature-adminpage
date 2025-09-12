package com.dncsglobal.mars.entity;

import com.dncsglobal.mars.enums.Status;
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
@Table(name = "Applications_Details")
public class ApplicationsEntity {
    @Id()
    private Long applicationId;
    private String candidateId;
    private String jobId;
    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDateTime appliedAt;

}
