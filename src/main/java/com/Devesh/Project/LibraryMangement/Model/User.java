package com.Devesh.Project.LibraryMangement.Model;

import com.Devesh.Project.LibraryMangement.Service.UserNameValidation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * User class with user details
 */
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull(message="User Name can not be null")
    @UserNameValidation(message="User Name not correct pattern")
    //@Pattern(regexp="^[a-zA-Z]*$")
    private String userName;

    @Email(message="Email Id can not be null")
    private String emailId;

    private int phoneNumber;

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getEmailId() {
        return emailId;
    }

    public User setEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public User setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
