package com.passwordgenerator.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserInfo getUserInfo() {
        return new UserInfo(1, "2","3", "4", "5", "6");
    }
}
