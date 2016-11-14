package com.workingtime.workingday.domain;

import com.workingtime.user.domain.User;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by Laci on 2016. 11. 14..
 */
@Entity
@Data
public class WorkingDay {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime arriving;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime departing;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}
