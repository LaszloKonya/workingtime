package com.workingtime.workingday.repository;

import com.workingtime.workingday.domain.WorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Laci on 2016. 11. 14..
 */
@Repository
public interface WorkingDayJPARepository extends JpaRepository<WorkingDay, Integer> {
}
