package com.appsdeveloperblog.estore.service;

import com.appsdeveloperblog.estore.data.UserRepository;
import com.appsdeveloperblog.estore.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @InjectMocks
    UserServiceImpl userService;
    @Mock
    UserRepository userRepository;
    String firstName;
    String lastName;
    String email;
    String password;
    String repeatPassword;

    @BeforeEach
    void init() {
        firstName = "Junior";
        lastName = "Oliveira";
        email = "teste@email.com";
        password = "123456789";
        repeatPassword = "12345678";
    }

    @DisplayName("User object created")
    @Test
    void testCreateUser_whenUserDetailsProvided_returnsUserObject() {
        //Arrange
        when(userRepository.save(any(User.class))).thenReturn(true);

        //Act
        User user = userService.createUser(firstName, lastName, email, password, repeatPassword);

        //Assert
        assertNotNull(user, "The user should not return null");
        assertEquals(firstName, user.getFirstName(), "User's firt name is wrong");
        assertEquals(lastName, user.getLastName(), "User's last name is wrong");
        assertEquals(email, user.getEmail(), "User's email is wrong");
        assertNotNull(user.getId(), "User id is missing");

        //Verify
        verify(userRepository).save(any(User.class));

    }

    @Test
    void testCreateUser_whenFirstNameIsEmpty_throwsIllegalArgumentException() {
        //Arrange
        String firstName = "";
        String expectedExceptionMessage = "First name can not be empty";

        //Act/Assert
        IllegalArgumentException aThrows = assertThrows(IllegalArgumentException.class, () -> {
            User user = userService.createUser(firstName, lastName, email, password, repeatPassword);
        }, "Name can not be empty");

        //Assert
        assertEquals(expectedExceptionMessage, aThrows.getMessage(), "Exception error message not correct");
    }
}
