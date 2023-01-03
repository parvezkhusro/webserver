package com.parvezkhusro.webserver.dao;

import com.parvezkhusro.webserver.entities.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {
    List<Library> findByUser_Name_Containing(String name);
    List<Library> findByStatusEquals(int status);
}
