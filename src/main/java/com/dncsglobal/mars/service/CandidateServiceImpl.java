package com.dncsglobal.mars.service;

import com.dncsglobal.mars.dto.CandidateDTO;
import com.dncsglobal.mars.entity.CandidateEntity;
import com.dncsglobal.mars.repository.CandidateRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class CandidateServiceImpl implements CandidateService{
    private CandidateRepository candidateRepository;

    public CandidateServiceImpl(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @Override
    public Boolean addCandidateData(CandidateDTO candidateDTO) {
        if(candidateDTO != null && candidateDTO.getCandidateId() != null){
            boolean exists = candidateRepository.existsById(candidateDTO.getCandidateId());
            if (exists) {
                return false;
            }
            CandidateEntity candidateEntity = new CandidateEntity();
            BeanUtils.copyProperties(candidateDTO,candidateEntity);
            candidateRepository.save(candidateEntity);
            return true;
        }else {
            return false;
        }
    }
}
