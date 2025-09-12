package com.dncsglobal.mars.service;

import com.dncsglobal.mars.dto.CandidateDTO;

import java.util.List;

public interface JobQueueService {
    List<CandidateDTO> getGlobalQueueData();

    List<CandidateDTO> getWIPQueueData();

    List<CandidateDTO> getEscalationQueueData();

    List<CandidateDTO> getFailedQueueData();

    List<CandidateDTO> getCompletedQueueData();

}
