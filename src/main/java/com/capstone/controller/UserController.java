package com.capstone.controller;

import com.capstone.dto.UserDto;
import com.capstone.dto.UserNeighborDto;
import com.capstone.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @PutMapping("/signup")
    public void insertUser(@RequestBody UserDto userDto){
        userService.insertUser(userDto);
    }

    @PutMapping("/neighbor")
    public void insertUserNeighbor(@RequestBody UserNeighborDto userNeighborDto){
        userService.insertUserNeighbor(userNeighborDto);
    }
}
