package com.learning.microservice.controller;

import com.learning.microservice.exception.UserServiceException;
import com.learning.microservice.model.request.UpdateUserDetailRequest;
import com.learning.microservice.model.request.UserDetailRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("users")
public class UserController{

    @GetMapping
    public String getUsers(){
        String firstName=null;
        int firstNameLength = firstName.length();
        return "";
    }

    @GetMapping(path="/{userId}", produces={
            MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public String getUser(@PathVariable String userId){
        if(true) throw new UserServiceException("user service exception is thrown");
        return "get";
    }

    @PostMapping(
            consumes={
                    MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE},
            produces={
                    MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE})
    public String createUser(@Valid @RequestBody UserDetailRequest userDetail){
        return "post";
    }

    @PutMapping(
            consumes={
                    MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE},
            produces={
                    MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE}
    )
    public String updateUser(@PathVariable String userId,@Valid @RequestBody UpdateUserDetailRequest updateUserDetail){

        return "update";
    }

    @DeleteMapping(path="/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable String userId){
        return ResponseEntity.noContent().build();
    }
}
