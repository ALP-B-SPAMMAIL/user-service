package com.example.user.event;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import com.example.user.eventDto.AbstractDto;

import lombok.Data;
@Data
public abstract class AbstractEvent {
    private String eventType;
    
    private AbstractDto payload;
    
    private Long timestamp;

    // Default constructor for Jackson deserialization
    public AbstractEvent() {
        this.eventType = this.getClass().getSimpleName();
        this.timestamp = Timestamp.valueOf(LocalDateTime.now()).getTime();
    }

    public AbstractEvent(AbstractDto payload) {
        this.payload = payload;
        this.eventType = this.getClass().getSimpleName();
        this.timestamp = Timestamp.valueOf(LocalDateTime.now()).getTime();
    }
}
