package com.adabinding.databinding.pojo;

/**
 * Created by emanuel.tanasa on 3/13/2018.
 */

public class User {

    private final String name;
    private final String address;
    private final String phoneNumber;
    private final String email;

    public User(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
