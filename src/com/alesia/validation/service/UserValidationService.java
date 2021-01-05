package com.alesia.validation.service;

import com.alesia.validation.model.InvalidUserAgeException;
import com.alesia.validation.model.InvalidUserNameException;
import com.alesia.validation.model.User;

public class UserValidationService {
    public void validate(User user) {
        String firstName = user.getFirstName();
        String lastName = user.getLastName();
        int age = user.getAge();
        int firstNameLength = firstName.length();
        int lastNameLength = lastName.length();
        if (firstNameLength < 3 || firstNameLength > 15) {
            throw new InvalidUserNameException();
        } else if (lastNameLength < 3 || lastNameLength > 15) {
            throw new InvalidUserNameException();
        } else if (age <= 0 || age >= 120) {
            throw new InvalidUserAgeException();
        } else {
            System.out.println("user is valid");
        }
    }
}