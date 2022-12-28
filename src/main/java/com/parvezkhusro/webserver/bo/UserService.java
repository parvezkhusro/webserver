package com.parvezkhusro.webserver.bo;

import com.parvezkhusro.webserver.model.User;

import java.util.ArrayList;
public interface UserService {
    ArrayList<User> findAllUsers();
    User findUserByID(long id);
    void addUser();
    void deleteAllData();
}
