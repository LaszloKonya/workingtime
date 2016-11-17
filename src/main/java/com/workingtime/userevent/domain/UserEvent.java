package com.workingtime.userevent.domain;

import com.workingtime.user.domain.User;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by Laci on 2016. 11. 14..
 */
@Entity
@Data
public class UserEvent {
    @Id
    @GeneratedValue
    @Column(name = "EVENT_ID")
    private long id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
    private User user;
    private LocalDateTime eventTime;
    private Event EVENT;
}
