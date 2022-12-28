package com.parvezkhusro.webserver.bo;

import com.parvezkhusro.webserver.dao.UserRepository;
import com.parvezkhusro.webserver.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public ArrayList<User> findAllUsers() {
        return (ArrayList<User>) userRepository.findAll();
    }

    @Override
    public User findUserByID(long id) {
        Optional<User> opt = userRepository.findById(id);
        if (opt.isPresent())
            return opt.get();
        else
            return null;
    }

    @Override
    public void addUser() {
    }

    @Override
    public void deleteAllData() {
        userRepository.deleteAll();
    }
}
