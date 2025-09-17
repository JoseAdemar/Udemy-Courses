package com.appsdeveloperblog.estore.model;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String id;

    public User(String firstName, String lastName, String email, String id) {
        validaFirstName(firstName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id = id;
    }

    private void validaFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("First name can not be empty");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }
}
