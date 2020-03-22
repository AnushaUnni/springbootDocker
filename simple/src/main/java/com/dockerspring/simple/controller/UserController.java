package com.dockerspring.simple.controller;

import com.dockerspring.simple.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value="/{id}/user")
    public ResponseEntity getUser(@PathVariable("id") Integer id) {
        String response = userService.findUserById(id);
        return ResponseEntity.ok(response);
    }
}
