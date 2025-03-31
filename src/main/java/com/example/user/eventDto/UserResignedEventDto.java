package com.example.user.eventDto;

import com.example.user.model.User;

import lombok.Getter;

@Getter
public class UserResignedEventDto extends AbstractDto{
    private int userId;

    public UserResignedEventDto() {
    }

    public UserResignedEventDto(User user) {
        this.userId = user.getId();
    }
}
