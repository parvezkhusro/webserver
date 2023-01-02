package com.parvezkhusro.webserver.bo;

import com.parvezkhusro.webserver.entities.Library;

import java.util.ArrayList;
import java.util.List;

public interface LibraryService {
    ArrayList<Library> findAllLibraryUsers();

    Library findUser(long id);

    List<Library> findUserByName(String name);
}
