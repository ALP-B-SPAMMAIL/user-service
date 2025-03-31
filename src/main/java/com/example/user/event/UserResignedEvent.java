package com.example.user.event;

import com.example.user.eventDto.UserResignedEventDto;

import lombok.Getter;

@Getter
public class UserResignedEvent extends AbstractEvent{
    private UserResignedEventDto payload;

    public UserResignedEvent() {
        super();
    }

    public UserResignedEvent(UserResignedEventDto payload) {
        super(payload);
        this.topic = "user";
        this.payload = payload;
    }
}
