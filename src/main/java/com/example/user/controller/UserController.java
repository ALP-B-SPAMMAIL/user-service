package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.dto.UserResignDto;
import com.example.user.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;




@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test() {
        return "ok!!!";
    }
    

    // @PostMapping("/register")
    // public int register(@RequestBody UserRegisterDto userRegisterDto) {
    //     return userService.register(userRegisterDto);
    // }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(
        @PathVariable int id,
        @RequestBody UserResignDto userResignDto
        ) {
        return ResponseEntity.ok(userService.delete(id, userResignDto));
    }
}
