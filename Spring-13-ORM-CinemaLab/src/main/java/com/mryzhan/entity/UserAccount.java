package com.mryzhan.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class UserAccount extends BaseEntity {
    public String email;
    public String password;
    public String username;

    @OneToOne
    @JoinColumn(name = "account_details_id")
    public AccountDetails accountDetails;

}
