package com.dncsglobal.mars.entity;

import com.dncsglobal.mars.enums.JobType;
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
@Table(name = "Jobs_Details")
public class JobsEntity {
    @Id
    private Long jobId;
    private String employerId;
    private String jobTitle;
    private String jobDescription;
    private String location;
    private String salaryRange;
    private String visaType;
    @Enumerated(EnumType.STRING)
    private JobType jobType;
    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDateTime createdAt;
}
