package com.workingtime.workingday.controller;

import com.workingtime.workingday.domain.WorkingDay;
import com.workingtime.workingday.service.WorkingDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by Laci on 2016. 11. 14..
 */
@RestController
public class WorkingDayController {
    @Autowired
    private WorkingDayService service;

    @RequestMapping(value = "/workingdays", method = RequestMethod.GET)
    public Collection<WorkingDay> getAllWorkingDays() {
        return service.getAlWorkingDays();
    }

    @RequestMapping(value = "/workingday/{id}", method = RequestMethod.GET)
    public WorkingDay getSpecificWorkingDay(@PathVariable("id") Integer id) {
        return service.getWorkingDayById(id);
    }

    @RequestMapping(value = "/workingday", method = RequestMethod.POST)
    public WorkingDay getSpecificWorkingDay(@RequestBody() WorkingDay WorkingDay) {
        return service.saveWorkingDay(WorkingDay);
    }

    @RequestMapping(value = "/workingday/{id}", method = RequestMethod.DELETE)
    public void deleteSpecificWorkingDay(@PathVariable("id") Integer id) {
        service.deleteWorkingDay(id);
    }
}
