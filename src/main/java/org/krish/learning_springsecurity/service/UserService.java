package org.krish.learning_springsecurity.service;

import org.krish.learning_springsecurity.model.Users;
import org.krish.learning_springsecurity.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public Users registerUser(Users user) {
        return userRepo.save(user);
    }
}
