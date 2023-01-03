package com.parvezkhusro.webserver.dao;

import com.parvezkhusro.webserver.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNameContaining(String n);

    List<User> findByAgeGreaterThan(long age);
}
