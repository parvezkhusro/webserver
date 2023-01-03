package com.parvezkhusro.webserver.bo;

import com.parvezkhusro.webserver.entities.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    ArrayList<User> findAllUsers();
    User findUserByID(long id);
    boolean addUser(User user);
    void deleteAllData();
}
