package com.cydeo.bootstrap;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.entity.Role;
import com.cydeo.enums.Gender;
import com.cydeo.enums.Status;
import com.cydeo.service.ProjectService;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import com.cydeo.service.impl.AbstractMapService;
import com.cydeo.service.impl.ProjectServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataGenerator extends AbstractMapService<Role, Long> implements CommandLineRunner {

    RoleService roleService;
    UserService userService;

    ProjectService projectService;

    public DataGenerator(RoleService roleService, UserService userService, ProjectService projectService) {
        this.roleService = roleService;
        this.userService = userService;
        this.projectService = projectService;
    }

    @Override
    public void run(String... args) throws Exception {

        RoleDTO adminRole = new RoleDTO(1L, "admin");
        RoleDTO managerRole = new RoleDTO(2L, "Manager");
        RoleDTO employeeRole = new RoleDTO(3L, "Employee");

        roleService.save(adminRole);
        roleService.save(managerRole);
        roleService.save(employeeRole);

        UserDTO user1 = new UserDTO("john01", "kesy01", "john01@Cydeo@gmail.com", "abc101", true, "123456701", managerRole, Gender.MALE);
        UserDTO user2 = new UserDTO("john02", "kesy02", "john02@Cydeo@gmail.com", "abc102", true, "123456702", managerRole, Gender.MALE);
        UserDTO user3 = new UserDTO("john03", "kesy03", "john03@Cydeo@gmail.com", "abc103", true, "123456703", managerRole, Gender.MALE);
        UserDTO user4 = new UserDTO("john04", "kesy04", "john04@Cydeo@gmail.com", "abc104", true, "123456704", managerRole, Gender.MALE);
        UserDTO user5 = new UserDTO("john05", "kesy05", "john05@Cydeo@gmail.com", "abc105", true, "123456705", managerRole, Gender.MALE);
        UserDTO user6 = new UserDTO("john06", "kesy06", "john06@Cydeo@gmail.com", "abc106", true, "123456706", adminRole, Gender.MALE);


        ProjectDTO p1 = new ProjectDTO("CRM System", "CRM001",
                new UserDTO("Alice", "Johnson", "aliceJ", "pass123", true, "123-456-7890", adminRole, Gender.FEMALE),
                LocalDate.of(2024, 1, 1), LocalDate.of(2024, 6, 1), "Customer management platform", Status.OPEN);

        ProjectDTO p2 = new ProjectDTO("Inventory App", "INV002",
                new UserDTO("Bob", "Smith", "bobS", "invpass", true, "234-567-8901", managerRole, Gender.MALE),
                LocalDate.of(2024, 2, 10), LocalDate.of(2024, 7, 10), "Warehouse tracking", Status.IN_PROGRESS);

        ProjectDTO p3 = new ProjectDTO("HR Tool", "HR003",
                new UserDTO("Cathy", "Brown", "cathyB", "hrsecure", true, "345-678-9012", adminRole, Gender.FEMALE),
                LocalDate.of(2024, 3, 5), LocalDate.of(2024, 8, 5), "Employee management", Status.COMPLETE);

        ProjectDTO p4 = new ProjectDTO("Accounting Module", "ACC004",
                new UserDTO("David", "Lee", "davidL", "accpass", true, "456-789-0123", employeeRole, Gender.MALE),
                LocalDate.of(2024, 4, 12), LocalDate.of(2024, 9, 12), "Finance reports", Status.IN_PROGRESS);

        ProjectDTO p5 = new ProjectDTO("Learning Portal", "LRN005",
                new UserDTO("Eva", "Martinez", "evaM", "learn123", true, "567-890-1234", adminRole, Gender.FEMALE),
                LocalDate.of(2024, 5, 20), LocalDate.of(2024, 10, 20), "Courses online", Status.OPEN);

        ProjectDTO p6 = new ProjectDTO("E-Commerce", "ECM006",
                new UserDTO("Frank", "Nguyen", "frankN", "ecompass", true, "678-901-2345", managerRole, Gender.MALE),
                LocalDate.of(2024, 6, 1), LocalDate.of(2024, 11, 1), "Online shopping", Status.COMPLETE);

        ProjectDTO p7 = new ProjectDTO("Data Analytics", "ANA007",
                new UserDTO("Grace", "Kim", "graceK", "analyzeIt", true, "789-012-3456", managerRole, Gender.FEMALE),
                LocalDate.of(2024, 7, 8), LocalDate.of(2024, 12, 8), "Reports and dashboards", Status.IN_PROGRESS);

        ProjectDTO p8 = new ProjectDTO("Chat App", "CHT008",
                new UserDTO("Henry", "Adams", "henryA", "chatme", true, "890-123-4567", adminRole, Gender.MALE),
                LocalDate.of(2024, 8, 15), LocalDate.of(2025, 1, 15), "Messaging system", Status.OPEN);

        ProjectDTO p9 = new ProjectDTO("Travel Booking", "TRV009",
                new UserDTO("Ivy", "Choi", "ivyC", "travelpass", true, "901-234-5678", managerRole, Gender.FEMALE),
                LocalDate.of(2024, 9, 1), LocalDate.of(2025, 2, 1), "Book flights & hotels", Status.COMPLETE);

        ProjectDTO p10 = new ProjectDTO("Health Tracker", "HLT010",
                new UserDTO("Jack", "Wilson", "jackW", "fitpass", true, "012-345-6789", employeeRole, Gender.MALE),
                LocalDate.of(2024, 10, 10), LocalDate.of(2025, 3, 10), "Fitness monitor", Status.OPEN);

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);
        userService.save(user6);

   projectService.save(p1);
   projectService.save(p2);
   projectService.save(p3);
   projectService.save(p4);
   projectService.save(p5);
   projectService.save(p6);
   projectService.save(p7);
   projectService.save(p8);
   projectService.save(p9);
   projectService.save(p10);






    }
}
