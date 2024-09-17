package com.example.flood_manager.service;

import com.example.flood_manager.domain.entity.User;
import com.example.flood_manager.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public User createUser(User user)
    {
        User response = userRepository.save(user);
        return response;
    }

    public List<User> getAllVolunteers()
    {
        List<User> users = userRepository.findUsers("volunteer");
        return users;
    }
}
