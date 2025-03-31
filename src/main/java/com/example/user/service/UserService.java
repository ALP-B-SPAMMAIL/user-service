package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.dto.UserRegisterDto;
import com.example.user.dto.UserResignDto;
import com.example.user.model.User;
import com.example.user.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public int register(UserRegisterDto userRegisterDto) {
        User user = User.builder()
            .name(userRegisterDto.getName())
            .job(userRegisterDto.getJob())
            .gender(userRegisterDto.getGender())
            .birthDate(userRegisterDto.getBirthDate())
            .password(userRegisterDto.getPassword())
            .interest(userRegisterDto.getInterest())
            .build();

        userRepository.save(user);
        return user.getId();
    }

    @Transactional
    public boolean delete(int userId, UserResignDto userResignDto) {
        User user = userRepository.findById(userId).orElse(null);
        if (user == null) {
            return false;
        }
        if (!user.getPassword().equals(userResignDto.getPassword())) {
            return false;
        }
        userRepository.deleteById(userId);
        return true;
    }
}
