package com.cydeo.service.impl;

import com.cydeo.dto.UserDTO;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImp extends AbstractMapService<UserDTO, String> implements UserService {
    @Override
    public UserDTO save(UserDTO object) {
        return super.save(object.getUsername(), object);
    }

    @Override
    public UserDTO findById(String s) {
        return super.findById(s);
    }

    @Override
    public void deleteById(String s) {
        super.deleteById(s);
    }

    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void update(UserDTO user) {
        super.update(user.getUsername(), user);
    }


    @Override
    public List<UserDTO> findManagers() {
        return super.findAll().stream().filter(user -> user.getRoleDTO().getId() == 2).collect(Collectors.toList());
    }

    @Override
    public List<UserDTO> findEmployees() {
        return super.findAll().stream().filter(user -> user.getRoleDTO().getId() == 3).collect(Collectors.toList());
    }

}
