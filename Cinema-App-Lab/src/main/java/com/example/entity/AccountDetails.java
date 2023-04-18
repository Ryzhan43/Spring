package com.example.entity;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;

import javax.management.relation.Role;

public class AccountDetails extends BaseEntity{
    public String name;
    public String address;
    public String country;
    public String city;
    public String state;
    public int age;
    public String postalCode;
    @Enumerated(EnumType.STRING)
    public Role role;

    @OneToOne
    private UserAccount userAccount;

}
