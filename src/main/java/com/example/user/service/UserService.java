package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.dto.UserRegisterDto;
import com.example.user.dto.UserResignDto;
import com.example.user.event.UserRegisteredEvent;
import com.example.user.event.UserResignedEvent;
import com.example.user.eventDto.UserRegisteredEventDto;
import com.example.user.eventDto.UserResignedEventDto;
import com.example.user.kafka.KafkaProducer;
import com.example.user.model.User;
import com.example.user.repository.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private KafkaProducer kafkaProducer;

    // @Transactional
    // public int register(UserRegisterDto userRegisterDto) {
    //     try {
    //         User user = User.builder()
    //             .name(userRegisterDto.getName())
    //             .job(userRegisterDto.getJob())
    //             .gender(userRegisterDto.getGender())
    //             .birthDate(userRegisterDto.getBirthDate())
    //             .password(userRegisterDto.getPassword())
    //             .interest(userRegisterDto.getInterest())
    //             .build();

    //         userRepository.save(user);
    //         kafkaProducer.publish(new UserRegisteredEvent(new UserRegisteredEventDto(user)));
    //         return user.getId();
    //     } catch (JsonProcessingException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //         return -1;
    //     }
    // }

    // @Transactional
    // public boolean delete(int userId, UserResignDto userResignDto) {
    //     try {
    //         User user = userRepository.findById(userId).orElse(null);
    //         if (user == null) {
    //             return false;
    //         }
    //         if (!user.getPassword().equals(userResignDto.getPassword())) {
    //             return false;
    //         }
    //         userRepository.deleteById(userId);
    //         kafkaProducer.publish(new UserResignedEvent(new UserResignedEventDto(user)));
    //         return true;
    //     } catch (JsonProcessingException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //         return false;
    //     }
    // }
}
