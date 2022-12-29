package com.parvezkhusro.webserver.bo;

import com.parvezkhusro.webserver.dao.UserRepository;
import com.parvezkhusro.webserver.entities.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public ArrayList<User> findAllUsers() {
        return (ArrayList<User>) userRepository.findAll();
    }

    @Override
    public User findUserByID(long id) {
        log.debug("Came to findUserByID");
        Optional<User> opt = userRepository.findById(id);
        if (opt.isPresent())
            return opt.get();
        else
            return null;
    }

    @Override
    public boolean addUser(User user) {
        User usr = userRepository.save(user);
        log.info("User : {}", usr);
        return (usr != null);
    }

    @Override
    public void deleteAllData() {
        userRepository.deleteAll();
        log.info("Number of records left: {}", userRepository.count());
    }
}
