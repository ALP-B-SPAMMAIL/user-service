package com.example.user.eventDto;

import com.example.user.model.User;

import lombok.Getter;

@Getter
public class UserRegisteredEventDto extends AbstractDto{
    private int userId;

    public UserRegisteredEventDto() {
    }

    public UserRegisteredEventDto(User user) {
        this.userId = user.getId();
    }
}
