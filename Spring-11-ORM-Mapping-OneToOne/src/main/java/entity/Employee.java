package entity;

import enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Data
@NoArgsConstructor
public class Employee extends BaseEntity{

    @Column(name = "first_name", length = 50)
    private String firstName;
    @Column(name = "last_name", length = 50)
    private String lastName;
    @Column(name = "email", length = 50)
    private String email;
    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;
    @Column(name = "department", length = 17)
    private Department department;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private int salary;
    private int regionId;

}
