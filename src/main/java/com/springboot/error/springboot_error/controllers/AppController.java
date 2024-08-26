package com.springboot.error.springboot_error.controllers;

import com.springboot.error.springboot_error.exceptions.UserNotFoundException;
import com.springboot.error.springboot_error.models.domain.User;
import com.springboot.error.springboot_error.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {

    @Autowired
    private IUserService userService;

    @GetMapping("/app")
    public String index(){
        //int value = 100 / 0;
        //int value = Integer.parseInt("14x");
        return "200";
    }

    @GetMapping("/show/{id}")
    public User show(@PathVariable(name = "id") Long id){
        User user = userService.findById(id);
        if (user == null){
            throw new UserNotFoundException("El usuario no existe!!!");
        }
        return user;
    }
}
