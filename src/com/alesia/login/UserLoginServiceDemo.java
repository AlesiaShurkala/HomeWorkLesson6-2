package com.alesia.login;

import com.alesia.login.model.User;
import com.alesia.login.service.UserLoginService;

public class UserLoginServiceDemo {
    public static void main(String[] args) {
        User userOne = new User("alesia", "123456");
        UserLoginService loginService = new UserLoginService();
        loginService.login(userOne, "1234");
        loginService.login(userOne, "123");
        loginService.login(userOne, "12371");
        loginService.login(userOne, "1237");
        userOne.unblockUser();
        loginService.login(userOne, "123456");

    }
}
