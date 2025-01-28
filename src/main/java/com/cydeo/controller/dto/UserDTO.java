package com.cydeo.controller.dto;

import com.cydeo.controller.entity.Role;
import com.cydeo.controller.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
     private String firstName;
     private String lastName;
     private String username;
     private String password;
     private boolean enabled;
     private String phone;
     private RawDTO rawDTO;
     private Gender gender;
     private Role role;

}
