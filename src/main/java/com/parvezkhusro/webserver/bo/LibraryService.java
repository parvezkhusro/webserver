package com.parvezkhusro.webserver.bo;

import com.parvezkhusro.webserver.dao.LibraryRepository;
import com.parvezkhusro.webserver.entities.Library;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {
    private static final Logger log = LoggerFactory.getLogger(LibraryService.class);
    final LibraryRepository libraryRepository;

    LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public List<Library> findAllLibraryUsers(int active) {
        List<Library> resp = null;
        if(active == 1) {
            resp = libraryRepository.findByStatusEquals(1);
        } else {
            resp = libraryRepository.findAll();
        }

        return resp;
    }

    public Library findUser(long id) {
        Optional<Library> opt = libraryRepository.findById(id);
        if (opt.isPresent())
            return opt.get();
        else
            return null;
    }

    public List<Library> findUserByNameContaining(String name) {
        log.debug("In findUserByNameContaining {}", name);
        return libraryRepository.findByUser_Name_Containing(name);
    }

    public List<Library> findUserByStatus(int status) {
        return libraryRepository.findByStatusEquals(status);
    }
}
