package com.example.user.eventDto;

import com.example.user.model.User;

import lombok.Getter;

@Getter
public class UserRegistedEventDto extends AbstractDto{
    private int userId;

    public UserRegistedEventDto() {
    }

    public UserRegistedEventDto(User user) {
        this.userId = user.getId();
    }
}
