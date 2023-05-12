package com.bridgelabz;
import com.brdigelabz.InvalidDetailsException;
import com.brdigelabz.UserRegistration;
import org.junit.Assert;
import org.junit.Before;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    static UserRegistration userRegistration;

    @BeforeAll
    public static void init() {
        System.out.println("Before all");
        userRegistration = new UserRegistration();
    }

    @Test
    void givenFirstNameShouldReturnTrue() throws InvalidDetailsException {
        boolean value = userRegistration.validateFirstName("Rajnish");
        Assertions.assertTrue(value);
        System.out.println("First Name Checked:- Successfully Passed UC1");
    }

    @Test
    void givenLastNameShouldReturnTrue() throws InvalidDetailsException {
        boolean LastName = userRegistration.validateLastName("Kumar");
        Assertions.assertTrue(LastName);
        System.out.println("Last Name Checked :- Successfully Passed UC2");
    }

    @Test
    void givenEmailIdShouldReturnTrue() throws InvalidDetailsException {
        boolean Email = userRegistration.validateEmail("rajneeshsingh@gmail.com");
        Assertions.assertTrue(Email);
        System.out.println("Email ID Checked :- Successfully Passed UC3");
    }

    @Test
    void givenMobileNumberShouldReturnTrue() throws InvalidDetailsException {
        boolean PhoneNumber = userRegistration.validatePhoneNumber("917541061533");
        Assertions.assertTrue(PhoneNumber);
        System.out.println("PhoneNumber Checked :- Successfully Passed UC4");
    }

    @Test
    void checkPasswordShouldReturnTrue() throws InvalidDetailsException {
        boolean Password = userRegistration.validatePassword("Rajneesh@9");
        Assertions.assertTrue(Password);
        System.out.println("Password Checked(Rule1, Rule2, Rule3 & Rule4) :- Successfully Passed UC5,UC6,UC7,UC8");
    }
}
