package com.parvezkhusro.webserver.dao;

import com.parvezkhusro.webserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    ArrayList<User> findAllUsers();
}
