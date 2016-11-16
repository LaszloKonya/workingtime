package com.workingtime.userevent.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

import com.sun.xml.internal.bind.v2.model.core.ID;
import com.workingtime.event.domain.Event;

/**
 * Created by Laci on 2016. 11. 14..
 */
@Entity
@Data
public class UserEvent {
    @Id
    @GeneratedValue
    private int id;
    private LocalDateTime eventTime;
    private Event EVENT;
}
