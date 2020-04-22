package com.elsalary.service;

import com.elsalary.model.User;
import com.elsalary.model.Request.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(Long id);
    User findOne(String username);

    User findById(Long id);

    User saveAdmin(User user);
}
