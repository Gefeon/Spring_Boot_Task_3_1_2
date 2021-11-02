package com.gefeon.Spring_Boot_Task_3_1_2.service;

import com.gefeon.Spring_Boot_Task_3_1_2.dao.RoleDao;
import com.gefeon.Spring_Boot_Task_3_1_2.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleDao roleDao;

    @Autowired
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    @Transactional
    public void addRole(Role role) {
        roleDao.addRole(role);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Role> listRoles() {
        return roleDao.listRoles();
    }

    @Override
    @Transactional(readOnly = true)
    public Role getRole(Long id) {
        return roleDao.getRole(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Role getRole(String role) {
        return roleDao.getRole(role);
    }
}
