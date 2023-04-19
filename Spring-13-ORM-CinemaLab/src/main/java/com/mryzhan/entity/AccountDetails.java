package com.mryzhan.entity;

import com.example.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;

@Entity
public class AccountDetails extends BaseEntity {
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
