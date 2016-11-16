package com.workingtime.userevent.repository;

import com.workingtime.userevent.domain.UserEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Laci on 2016. 11. 14..
 */
@RepositoryRestResource(collectionResourceRel = "userevent", itemResourceRel = "userevent", path = "userevent")
public interface UserEventJpaRepository extends JpaRepository<UserEvent, Integer> {
}
