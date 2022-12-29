package com.parvezkhusro.webserver.bo;

import com.parvezkhusro.webserver.entities.User;

import java.util.ArrayList;
public interface UserService {
    ArrayList<User> findAllUsers();
    User findUserByID(long id);
    boolean addUser(User user);
    void deleteAllData();
}
