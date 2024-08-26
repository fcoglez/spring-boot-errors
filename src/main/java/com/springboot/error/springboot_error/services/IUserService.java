package com.springboot.error.springboot_error.services;

import com.springboot.error.springboot_error.models.domain.User;

import java.util.List;

public interface IUserService {

    List<User> findALl();
    User findById(Long id);
}
