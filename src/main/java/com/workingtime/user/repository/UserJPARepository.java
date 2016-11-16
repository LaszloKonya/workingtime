package com.workingtime.user.repository;

import com.workingtime.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Laci on 2016. 11. 14..
 */
@RepositoryRestResource(collectionResourceRel = "user", itemResourceRel = "user", path = "user")
public interface UserJPARepository extends JpaRepository<User,Integer>{
}
