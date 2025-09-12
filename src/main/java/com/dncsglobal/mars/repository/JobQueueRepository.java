package com.dncsglobal.mars.repository;

import com.dncsglobal.mars.dto.CandidateDTO;
import com.dncsglobal.mars.entity.CandidateEntity;
import com.dncsglobal.mars.enums.CandidateStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobQueueRepository extends JpaRepository<CandidateEntity,String> {
//    @Query("SELECT l FROM CandidateEntity l WHERE l.status = :status")
    List<CandidateEntity> findByStatus(CandidateStatus status);
}
