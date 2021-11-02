package com.gefeon.Spring_Boot_Task_3_1_2.dao;

import com.gefeon.Spring_Boot_Task_3_1_2.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void editUser(User updatedUser);

    void deleteUser(Long id);

    User getUserById(Long id);

    List<User> listUsers();

    User getUserByUsername(String username);
}