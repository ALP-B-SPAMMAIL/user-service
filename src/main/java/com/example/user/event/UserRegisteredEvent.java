package com.example.user.event;

import com.example.user.eventDto.UserRegisteredEventDto;

import lombok.Getter;

@Getter
public class UserRegisteredEvent extends AbstractEvent{
    private UserRegisteredEventDto payload;

    public UserRegisteredEvent() {
        super();
    }

    public UserRegisteredEvent(UserRegisteredEventDto payload) {
        super(payload);
        this.topic = "user";
        this.payload = payload;
    }
}
