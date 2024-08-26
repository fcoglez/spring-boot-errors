package com.springboot.error.springboot_error.services;

import com.springboot.error.springboot_error.models.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService{

    private List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
        users.add(new User(1L, "Francisco", "González"));
        users.add(new User(2L, "María", "Rodríguez"));
        users.add(new User(3L, "José", "Martínez"));
        users.add(new User(4L, "Ana", "López"));
        users.add(new User(5L, "Juan", "Fernández"));
        users.add(new User(6L, "Laura", "García"));
    }

    @Override
    public List<User> findALl() {
        return users;
    }

    @Override
    public User findById(Long id) {
        User user = null;
        for (User u: users){
            if (u.getId().equals(id)){
                user = u;
                break;
            }
        }
        return user;
    }
}
