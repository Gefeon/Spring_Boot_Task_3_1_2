package com.gefeon.Spring_Boot_Task_3_1_2.service;

import com.gefeon.Spring_Boot_Task_3_1_2.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    void addUser(User user);

    void editUser(User updatedUser);

    void deleteUser(Long id);

    User getUserById(Long id);

    List<User> listUsers();
}