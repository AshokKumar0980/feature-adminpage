package com.dncsglobal.mars.controller;

import com.dncsglobal.mars.dto.UserDto;
import com.dncsglobal.mars.model.UserModel;
import com.dncsglobal.mars.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping("/{id}")
    public UserDto userDetails(@PathVariable String id){
        return userService.getUserById(id);
    }
    @PostMapping("/addUser")
    public ResponseEntity<String> addUser(@RequestBody UserModel userModel){
        boolean isUserAdded = userService.addUser(userModel);
        if(isUserAdded){
            return new ResponseEntity<>("userAdded",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("user not added",HttpStatus.NOT_IMPLEMENTED);
        }
    }

}
