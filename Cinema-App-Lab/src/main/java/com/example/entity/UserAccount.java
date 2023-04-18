package com.example.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

public class UserAccount extends BaseEntity{
    public String email;
    public String password;
    public String username;

    @OneToOne(cascade = CascadeType.ALL)
    public AccountDetails accountDetails;

    @OneToMany(mappedBy = "userAccount")
    private List<Ticket> ticketList;
}
