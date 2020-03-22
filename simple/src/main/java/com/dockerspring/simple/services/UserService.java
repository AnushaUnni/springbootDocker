package com.dockerspring.simple.services;

import com.dockerspring.auth.entity.entities.User;
import com.dockerspring.auth.entity.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UsersRepository usersRepository;

    public String findUserById(Integer id) {
        Optional<User> user = usersRepository.findById(id);
        if(user.isPresent()){
            return "UserName for the given id is" + user.get().getUsername();
        }
        else{
            return "No user with given id ";
        }
    }
}
