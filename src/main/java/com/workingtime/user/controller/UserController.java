package com.workingtime.user.controller;

import com.workingtime.user.domain.User;
import com.workingtime.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by Laci on 2016. 11. 14..
 */
@RestController
public class UserController {

    @Autowired
    UserService service;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public Collection<User> getAllUsers(){
        return service.getAllUsers();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getSpecificUser(@PathVariable("id") Integer id){
        return service.getUserById(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User getSpecificUser(@RequestBody() User user){
        return service.saveUser(user);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public void deleteSpecificUser(@PathVariable("id") Integer id){
        service.deleteUser(id);
    }

}
