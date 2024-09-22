package com.example.flood_manager.service;

import com.example.flood_manager.domain.entity.User;
import com.example.flood_manager.domain.response.UserResponse;
import com.example.flood_manager.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private UserRepository userRepository;

    //UserResponse userResponse= new UserResponse();

    public User createUser(UserResponse userResponse)
    {
       User user= UserResponse.convert(userResponse);
        User response = userRepository.save(user);
        return response;
    }

    public User createLogin(UserResponse userResponse)
    {
           return new User();
    }

    public List<User> getAllVolunteers()
    {
        List<User> users = userRepository.findUsers("volunteer");
        return users;
    }
}
