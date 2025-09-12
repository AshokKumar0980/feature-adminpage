package com.dncsglobal.mars.dto;

import com.dncsglobal.mars.enums.CandidateStatus;
import com.dncsglobal.mars.enums.Priority;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class CandidateDTO {
    private String candidateId;
    private String userId;
    private String fullName;
    private String phoneNumber;
    private String resumeUrl;
    private String skills;
    private Float experience;
    private String location;
    private String visa;
    @Enumerated(EnumType.STRING)
    private Priority priority;
    @Enumerated(EnumType.STRING)
    private CandidateStatus status;
}
