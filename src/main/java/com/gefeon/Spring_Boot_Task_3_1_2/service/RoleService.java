package com.gefeon.Spring_Boot_Task_3_1_2.service;

import com.gefeon.Spring_Boot_Task_3_1_2.model.Role;

import java.util.List;

public interface RoleService {

    void addRole(Role role);

    List<Role> listRoles();

    Role getRole(Long id);

    Role getRole(String role);
}