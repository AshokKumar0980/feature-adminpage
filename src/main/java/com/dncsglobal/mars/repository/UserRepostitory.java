package com.dncsglobal.mars.repository;

import com.dncsglobal.mars.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepostitory extends JpaRepository<UsersEntity,String> {

}
