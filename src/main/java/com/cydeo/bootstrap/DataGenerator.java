package com.cydeo.bootstrap;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.entity.Role;
import com.cydeo.enums.Gender;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import com.cydeo.service.impl.AbstractMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator extends AbstractMapService<Role, Long> implements CommandLineRunner {

    RoleService roleService;
    UserService userService;

    public DataGenerator(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {

        RoleDTO adminRole = new RoleDTO(1L, "admin");
        RoleDTO managerRole = new RoleDTO(2L, "admin");
        RoleDTO employeeRole = new RoleDTO(3L, "admin");
        roleService.save(adminRole);
        roleService.save(managerRole);
        roleService.save(employeeRole);

        UserDTO user1 = new UserDTO("john01", "kesy01", "john01@Cydeo@gmail.com", "abc101", true, "123456701", managerRole, Gender.MALE);
        UserDTO user2 = new UserDTO("john02", "kesy02", "john02@Cydeo@gmail.com", "abc102", true, "123456702", managerRole, Gender.MALE);
        UserDTO user3 = new UserDTO("john03", "kesy03", "john03@Cydeo@gmail.com", "abc103", true, "123456703", managerRole, Gender.MALE);
        UserDTO user4 = new UserDTO("john04", "kesy04", "john04@Cydeo@gmail.com", "abc104", true, "123456704", managerRole, Gender.MALE);
        UserDTO user5 = new UserDTO("john05", "kesy05", "john05@Cydeo@gmail.com", "abc105", true, "123456705", managerRole, Gender.MALE);
        UserDTO user6 = new UserDTO("john06", "kesy06", "john06@Cydeo@gmail.com", "abc106", true, "123456706", managerRole, Gender.MALE);

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);
        userService.save(user6);


    }
}
