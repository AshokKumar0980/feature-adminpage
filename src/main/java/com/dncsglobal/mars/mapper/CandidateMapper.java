package com.dncsglobal.mars.mapper;

import com.dncsglobal.mars.dto.CandidateDTO;
import com.dncsglobal.mars.entity.CandidateEntity;

import java.util.List;

public class CandidateMapper {
    public static CandidateDTO toDto(CandidateEntity entity) {
        return CandidateDTO.builder()
                .candidateId(entity.getCandidateId())
                .userId(entity.getUserId())
                .fullName(entity.getFullName())
                .phoneNumber(entity.getPhoneNumber())
                .resumeUrl(entity.getResumeUrl())
                .skills(entity.getSkills())
                .experience(entity.getExperience())
                .location(entity.getLocation())
                .visa(entity.getVisa())
                .priority(entity.getPriority())
                .status(entity.getStatus())
                .build();
    }
    public static List<CandidateDTO> toDtoList(List<CandidateEntity> entities) {
        return entities.stream()
                .map(CandidateMapper::toDto)
                .toList();
    }

}
