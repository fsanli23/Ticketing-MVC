package com.cydeo.controller;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.service.ProjectService;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/project")
public class ProjectController {

    ProjectService projectService;

    UserService userService;


    public ProjectController(ProjectService projectService, UserService userService) {
        this.projectService = projectService;
        this.userService = userService;
    }


    @GetMapping("/create")
    public String project(Model model) {

        model.addAttribute("project", new ProjectDTO());
        model.addAttribute("projects", projectService.findAll());
        model.addAttribute("managers", userService.findManagers());
        return "project/create";
    }

    @PostMapping("/create")
    public String insertProject(@ModelAttribute("project") ProjectDTO projectDTO) {
        projectService.save(projectDTO);
        return "redirect:/project/create";
    }

    @GetMapping("/delete/{projectcode}")
    public String DeleteProject(@PathVariable("projectcode") String projectcode) {

        projectService.deleteById(projectcode);
        return "redirect:/project/create";
    }

    @GetMapping("complete/{projectcode}")
    public String completeProject(@PathVariable("projectcode") String projectcode, RedirectAttributes redirectAttributes) {
        projectService.complete(projectService.findById(projectcode));
        return "redirect:/project/create";
    }

    @GetMapping("/update/{projectcode}")
    public String editProject(@PathVariable("projectcode") String projectcode, Model model) {

        model.addAttribute("project", projectService.findById(projectcode));
        model.addAttribute("projects", projectService.findAll());
        model.addAttribute("managers", userService.findManagers());


        return "/project/update";
    }

    @PostMapping("/update")
    public String updatedProject(@ModelAttribute("project") ProjectDTO projectDTO) {
        projectService.update(projectDTO);

        return "redirect:/project/create";
    }


}
