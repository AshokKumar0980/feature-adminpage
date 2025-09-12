package com.dncsglobal.mars.service;

import com.dncsglobal.mars.dto.UserDto;
import com.dncsglobal.mars.model.UserModel;

public interface UserService {
    UserDto getUserById(String id);

    boolean addUser(UserModel userModel);
}
