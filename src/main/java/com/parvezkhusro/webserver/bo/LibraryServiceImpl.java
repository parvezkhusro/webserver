package com.parvezkhusro.webserver.bo;

import com.parvezkhusro.webserver.dao.LibraryRespository;
import com.parvezkhusro.webserver.entities.Library;
import com.parvezkhusro.webserver.entities.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LibraryServiceImpl implements LibraryService {
    private static final Logger log = LoggerFactory.getLogger(LibraryServiceImpl.class);
    final LibraryRespository libraryRespository;

    LibraryServiceImpl(LibraryRespository libraryRespository) {
        this.libraryRespository = libraryRespository;
    }

    @Override
    public ArrayList<Library> findAllLibraryUsers() {
        log.debug("In findAllLibraryUsers");
        log.info("All library users: {}", libraryRespository.findAll());
        return (ArrayList<Library>) libraryRespository.findAll();
    }

    @Override
    public Library findUser(long id) {
        Optional<Library> opt = libraryRespository.findById(id);
        if (opt.isPresent())
            return opt.get();
        else
            return null;
    }

    @Override
    public List<Library> findUserByName(String name) {
        log.debug("In findUserByName {}", name);
        return libraryRespository.findAll().stream()
                .filter(r -> r.getUser().getName().toLowerCase().contains(
                        name.toLowerCase())).collect(Collectors.toList());
    }
}
