package com.dncsglobal.mars.controller;

import com.dncsglobal.mars.dto.CandidateDTO;
import com.dncsglobal.mars.service.JobQueueServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobqueue")
public class JobQueueController {
    private JobQueueServiceImpl jobQueueService;

    public JobQueueController(JobQueueServiceImpl jobQueueService){
        this.jobQueueService = jobQueueService;
    }
    @GetMapping("/global")
    public List<CandidateDTO> getGlobalQueueData(){
        return jobQueueService.getGlobalQueueData();
    }

    @GetMapping("/wip")
    public List<CandidateDTO> getWipQueueData(){
        return jobQueueService.getWIPQueueData();
    }

    @GetMapping("/escalation")
    public List<CandidateDTO> getEscalationQueue(){
        return jobQueueService.getEscalationQueueData();
    }
    @GetMapping("/failed")
    public List<CandidateDTO> getFailedQueueData(){
        return jobQueueService.getFailedQueueData();
    }

    @GetMapping("/completed")
    public List<CandidateDTO> getCompletedQueueData(){
        return jobQueueService.getCompletedQueueData();
    }


}
