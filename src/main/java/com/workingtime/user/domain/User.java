package com.workingtime.user.domain;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;

/**
 * Created by Laci on 2016. 11. 14..
 */
@Entity
@Data
public class User {
    @NonNull
    private String userName;
    private String fullName;
}
