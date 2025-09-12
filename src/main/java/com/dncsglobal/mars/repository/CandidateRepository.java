package com.dncsglobal.mars.repository;

import com.dncsglobal.mars.entity.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<CandidateEntity,String> {
}
