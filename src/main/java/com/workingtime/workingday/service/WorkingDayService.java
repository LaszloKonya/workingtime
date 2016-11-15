package com.workingtime.workingday.service;

import com.workingtime.workingday.domain.WorkingDay;
import com.workingtime.workingday.repository.WorkingDayJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Laci on 2016. 11. 14..
 */
@Service
public class WorkingDayService {
    private WorkingDayJPARepository repository;

    @Autowired
    public WorkingDayService(WorkingDayJPARepository repository) {
        this.repository = repository;
    }


    public WorkingDay getWorkingDayById(Integer id) {
        return repository.getOne(id);
    }

    public Collection<WorkingDay> getAlWorkingDays() {
        return repository.findAll();
    }

    public WorkingDay saveWorkingDay(WorkingDay workingDay) {
        return repository.save(workingDay);
    }

    public void deleteWorkingDay(Integer id) {
        repository.delete(id);
    }
}
