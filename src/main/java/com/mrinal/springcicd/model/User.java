package com.mrinal.springcicd.model;

import java.util.List;

public class User {
    private String name;
    private List<String> address;
    private String contactNo;
    private String emailId;

    public User(String name, List<String> address, String contactNo, String emailId) {
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
        this.emailId = emailId;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
