package com.example.flood_manager.api;

import com.example.flood_manager.domain.entity.User;
import com.example.flood_manager.domain.response.UserResponse;
import com.example.flood_manager.repository.UserRepository;
import com.example.flood_manager.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/create/register")
    public User processRegister(@RequestBody UserResponse userResponse) {
        return userService.createUser(userResponse);
    }

    @PostMapping("/create/login")
    public User processLogin(@RequestBody UserResponse userResponse){
        return userService.createLogin(userResponse);
    }

    @GetMapping("/get/users")
    public List<User> getAllVolunteers(){
        List<User> user=userService.getAllVolunteers();
        return user;
    }



}
