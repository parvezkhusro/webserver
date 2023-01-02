package com.parvezkhusro.webserver.dao;

import com.parvezkhusro.webserver.entities.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRespository extends JpaRepository<Library, Long> {
}
