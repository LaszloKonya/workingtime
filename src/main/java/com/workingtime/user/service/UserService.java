package com.workingtime.user.service;

import com.workingtime.user.domain.User;
import com.workingtime.user.repository.UserJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Laci on 2016. 11. 14..
 */
@Service
public class UserService {

    @Autowired
    private UserJPARepository repository;

    public User getUserById(Integer id) {
        return repository.getOne(id);
    }

    public Collection<User> getAllUsers() {
        return repository.findAll();
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public void deleteUser(Integer id) {
        repository.delete(id);
    }
}
