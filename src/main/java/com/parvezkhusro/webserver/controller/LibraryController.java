package com.parvezkhusro.webserver.controller;

import com.parvezkhusro.webserver.bo.LibraryService;
import com.parvezkhusro.webserver.bo.LibraryServiceImpl;
import com.parvezkhusro.webserver.entities.Library;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lib")
public class LibraryController {
    final LibraryService libraryService;
    LibraryController(LibraryServiceImpl libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping(path = {"/users", "/", ""})
    public List<Library> getAllLibraryUsers() {
        return libraryService.findAllLibraryUsers();
    }

    @PostMapping("/{name}")
    public List<Library> getUserByName(@PathVariable String name) {
        return libraryService.findUserByName(name);
    }
}
