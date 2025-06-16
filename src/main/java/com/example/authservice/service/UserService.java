package com.example.authservice.service;

import com.example.authservice.entities.User;
import com.example.authservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Optional<User> loadUserByUsername(String username) {
        return userRepository.findByEmail(username);
    }
}
