package com.example.user.event;

import com.example.user.eventDto.UserRegistedEventDto;

import lombok.Getter;

@Getter
public class UserRegistedEvent extends AbstractEvent{
    private UserRegistedEventDto payload;

    public UserRegistedEvent() {
        super();
    }

    public UserRegistedEvent(UserRegistedEventDto payload) {
        super(payload);
        this.topic = "user";
        this.payload = payload;
    }
}
