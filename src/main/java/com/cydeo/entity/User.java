package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class User extends BaseEntity{
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private boolean enabled;
    private Gender gender;
    private Role role;
    private String phone;

    public User(long id, LocalDate insertDateTime, LocalDate insertUserId, LocalDate lastUpdateDateTime, Long lastUpdateUserId, String username, String password, String firstName, String lastName, boolean enabled, Gender gender, Role role, String phone) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.enabled = enabled;
        this.gender = gender;
        this.role = role;
        this.phone = phone;
    }
}
