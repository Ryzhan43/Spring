package com.mryzhan.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class UserAccount extends BaseEntity {
    public String email;
    public String password;
    public String username;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_details_id")
    public AccountDetails accountDetails;

    @OneToMany(mappedBy = "userAccount")
    private List<Ticket> ticketList;
}
