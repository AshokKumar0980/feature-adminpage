package com.dncsglobal.mars.controller;

import com.dncsglobal.mars.dto.CandidateDTO;
import com.dncsglobal.mars.service.CandidateServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/candidate")
public class CandidateController {

    private CandidateServiceImpl candidateService;

    public CandidateController(CandidateServiceImpl candidateService){
        this.candidateService = candidateService;
    }

    @PostMapping
    public ResponseEntity<?> addCandidate(@RequestBody CandidateDTO candidateDTO){
        Boolean isCandidateAdded = candidateService.addCandidateData(candidateDTO);
        if(isCandidateAdded){
            return new ResponseEntity<>("Candidate Details Added", HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>("Not Created",HttpStatus.BAD_REQUEST);
        }
    }
}
