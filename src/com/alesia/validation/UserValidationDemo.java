package com.alesia.validation;

import com.alesia.validation.model.User;
import com.alesia.validation.service.UserValidationService;

import java.util.Scanner;

public class UserValidationDemo {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        UserValidationService validationService = new UserValidationService();
        System.out.println("Enter first name");
        user.setFirstName(scanner.next());
        System.out.println("Enter last name");
        user.setLastName(scanner.next());
        System.out.println("Enter age");
        user.setAge(scanner.nextInt());
        validationService.validate(user);
    }
}
