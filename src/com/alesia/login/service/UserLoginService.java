package com.alesia.login.service;

import com.alesia.login.model.User;

public class UserLoginService {
    public boolean login(User user, String password) {
        if (user.isUserBlocked()) {
            System.out.println("User is blocked");
            return false;
        }
        if (!user.getPassword().equals(password)) {
            System.out.println("Wrong password");
            user.decrementTries();
            return false;
        }
        user.resetTries();
        System.out.println("Successful login");
        return true;
    }
}
