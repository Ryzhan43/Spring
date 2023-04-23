package com.mryzhan.entity;

import com.mryzhan.enums.Role;
import com.mryzhan.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
public class AccountDetails extends BaseEntity {

    public String name;
    public String address;
    public String country;
    public String city;
    public String state;
    public Integer age;
    public String postalCode;

    @Enumerated(EnumType.STRING)
    public UserRole role = UserRole.USER;


}
