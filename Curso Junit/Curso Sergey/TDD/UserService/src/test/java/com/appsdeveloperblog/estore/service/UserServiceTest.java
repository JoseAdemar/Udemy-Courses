package com.appsdeveloperblog.estore.service;

import com.appsdeveloperblog.estore.model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserServiceTest {
    @DisplayName("User object created")
    @Test
    void testCreateUser_whenUserDetailsProvided_returnsUserObject() {
        //Arrange
        UserService userService = new UserServiceImpl();
        String firstName = "Junior";
        String lastName = "Oliveira";
        String email = "teste@email.com";
        String password = "123456789";
        String repeatPassword = "12345678";


        //Act
        User user = userService.createUser(firstName, lastName, email, password, repeatPassword);

        //Assert
        assertNotNull(user, "The user should not return null");
        assertEquals(firstName, user.getFirstName(), "User's firt name is wrong");
        assertEquals(lastName, user.getLastName(), "User's last name is wrong");
        assertEquals(email, user.getEmail(), "User's email is wrong");
        assertNotNull(user.getId(), "User id is missing");

    }
}
