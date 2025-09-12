package com.dncsglobal.mars.service;

import com.dncsglobal.mars.dto.UserDto;
import com.dncsglobal.mars.entity.UsersEntity;
import com.dncsglobal.mars.model.UserModel;
import com.dncsglobal.mars.repository.UserRepostitory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepostitory userRepostitory;
    public UserServiceImpl(UserRepostitory userRepostitory){
        this.userRepostitory = userRepostitory;
    }
    @Override
    public UserDto getUserById(String id) {
        UsersEntity usersEntity = userRepostitory.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found with ID: "+id));
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(usersEntity,userDto);
        return userDto;
    }

    @Override
    public boolean addUser(UserModel userModel) {
        if(userModel != null && userModel.getUserId() != null){
            UsersEntity usersEntity = new UsersEntity();
            BeanUtils.copyProperties(userModel,usersEntity);
            userRepostitory.save(usersEntity);
            return true;
        }
        return false;
    }
}
