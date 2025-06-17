package com.cydeo.service;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProjectService extends CrudService<ProjectDTO, String> {

    void complete(ProjectDTO projectDTO);

    List<ProjectDTO> getCountedListOfProjectDTO(UserDTO user);

    List<ProjectDTO> findAllNonCompletedProjects();


}
