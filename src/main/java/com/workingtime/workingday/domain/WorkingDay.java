package com.workingtime.workingday.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    //    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime arriving;
    //    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime departing;

}
