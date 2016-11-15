package com.workingtime.user.repository;

import com.workingtime.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Laci on 2016. 11. 14..
 */
@Repository
public interface UserJPARepository extends JpaRepository<User,Integer>{
}
