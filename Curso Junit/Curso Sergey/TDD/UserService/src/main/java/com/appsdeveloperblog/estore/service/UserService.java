package com.appsdeveloperblog.estore.service;

import com.appsdeveloperblog.estore.model.User;

public interface UserService {
    User createUser(String firstName, String lastName, String password, String repeatPassword);
}
