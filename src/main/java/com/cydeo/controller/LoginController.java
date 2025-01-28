package com.cydeo.controller;

import com.cydeo.controller.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping(value = {"/login", "/"})
    public String login() {

        return "login";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }


    @RequestMapping("user/create")
    public String create(Model model) {

        model.addAttribute("user", new UserDTO());
        model.addAttribute("message", "Welcome to CyDeo");


        return "user/create";
    }


}