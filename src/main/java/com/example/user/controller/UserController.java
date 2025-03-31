package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.dto.UserRegisterDto;
import com.example.user.dto.UserResignDto;
import com.example.user.service.UserService;



@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Integer> register(@RequestBody UserRegisterDto userRegisterDto) {
        return ResponseEntity.ok(userService.register(userRegisterDto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(
        @PathVariable int id,
        @RequestBody UserResignDto userResignDto
        ) {
        return ResponseEntity.ok(userService.delete(id, userResignDto));
    }
}
