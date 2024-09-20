package com.example.flood_manager.domain.response;

import com.example.flood_manager.domain.entity.User;
import lombok.Data;

@Data
public class UserResponse {
    private Long id;
    private String userName;
    private String contact;
    private String email;
    private String password;

    public static User convert(UserResponse userResponse)
    {
        User user = new User();
        user.setId(userResponse.getId());
        user.setUserName(userResponse.getUserName());
        user.setUserContact(userResponse.getContact());
        user.setUserEmail(userResponse.getEmail());
        user.setUserPassword(userResponse.getPassword());
        user.setUserRole("volunteer");
        return user;
    }
}
