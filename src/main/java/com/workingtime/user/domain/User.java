package com.workingtime.user.domain;

import com.workingtime.userevent.domain.UserEvent;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Laci on 2016. 11. 14..
 */
@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    @Column(name = "USER_ID", nullable = false)
    private long id;
    @Column(nullable = false, unique = true)
    private String userName;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<UserEvent> events;
}
