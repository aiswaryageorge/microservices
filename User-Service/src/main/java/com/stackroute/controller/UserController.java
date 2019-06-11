package com.stackroute.controller;

import com.stackroute.domain.User;
import com.stackroute.exception.UserAlreadyExistsException;
import com.stackroute.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1")
public class UserController {

    UserService userService;

    @Autowired

    public UserController(UserService userService)
    {
        this.userService=userService;
    }

    @PostMapping("user")
    public ResponseEntity<?> saveUser(@RequestBody User user)
    {
        ResponseEntity responseEntity;
        try{
            userService.saveUser(user);
            responseEntity=new ResponseEntity("successfully created", HttpStatus.CREATED);
        }catch (UserAlreadyExistsException ex)
        {
            responseEntity=new ResponseEntity<String>(ex.getMessage(),HttpStatus.CONFLICT);
            ex.printStackTrace();
        }
        return responseEntity;
    }

    @GetMapping("user")
    public ResponseEntity<?> getAllUsers()
    {
        return new ResponseEntity(userService.getAllUsers(), HttpStatus.OK);

    }
}
