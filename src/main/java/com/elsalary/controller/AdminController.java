package com.elsalary.controller;

import com.elsalary.model.User;
import com.elsalary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/admin/add", method = RequestMethod.POST)
    public User createAdmin(@RequestBody User user) {
        return userService.saveAdmin(user);
    }
}
