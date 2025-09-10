package com.appsdeveloperblog.estore.service;

import com.appsdeveloperblog.estore.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserServiceTest {
    @Test
    void testCreateUser_whenUserDetailsProvided_returnsUserObject() {
        //Arrange
        UserService userService = new UserServiceImpl();
        String firstName ="Junior";
        String lastName = "Oliveira";
        String password = "123456789";
        String repeatPassword = "12345678";

        //Act
        User user = userService.createUser(firstName, lastName, password, repeatPassword);

        //Assert
        assertNotNull(user, "The user should not return null");
    }
}
