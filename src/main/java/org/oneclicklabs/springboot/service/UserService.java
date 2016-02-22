package org.oneclicklabs.springboot.service;

import org.oneclicklabs.springboot.model.User;

import java.util.List;

/**
 * Created by karthy on 1/26/16.
 */
public interface UserService {

    User findById(long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    void deleteAllUsers();

    public boolean isUserExist(User user);

}
