package com.dncsglobal.mars.service;

import com.dncsglobal.mars.dto.CandidateDTO;
import com.dncsglobal.mars.entity.CandidateEntity;
import com.dncsglobal.mars.enums.CandidateStatus;
import com.dncsglobal.mars.mapper.CandidateMapper;
import com.dncsglobal.mars.repository.JobQueueRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobQueueServiceImpl implements JobQueueService{

    private final JobQueueRepository jobQueueRepository;

    public JobQueueServiceImpl(JobQueueRepository jobQueueRepository){
        this.jobQueueRepository = jobQueueRepository;
    }

    @Override
    public List<CandidateDTO> getGlobalQueueData() {
        List<CandidateEntity> candidateEntity = jobQueueRepository.findAll();
        return CandidateMapper.toDtoList(candidateEntity);
    }

    @Override
    public List<CandidateDTO> getWIPQueueData() {
        return CandidateMapper.toDtoList(jobQueueRepository.findByStatus(CandidateStatus.IN_TRAINING));


    }

    @Override
    public List<CandidateDTO> getEscalationQueueData() {
         jobQueueRepository.findByStatus(CandidateStatus.ESCALATED);
        return null;
    }

    @Override
    public List<CandidateDTO> getFailedQueueData() {
        return CandidateMapper.toDtoList(jobQueueRepository.findByStatus(CandidateStatus.INCOMPLETED));

    }

    @Override
    public List<CandidateDTO> getCompletedQueueData() {
        return CandidateMapper.toDtoList(jobQueueRepository.findByStatus(CandidateStatus.PLACED));
    }




}
