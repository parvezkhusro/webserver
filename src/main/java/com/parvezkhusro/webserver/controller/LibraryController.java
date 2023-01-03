package com.parvezkhusro.webserver.controller;

import com.parvezkhusro.webserver.bo.LibraryService;
import com.parvezkhusro.webserver.entities.Library;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lib")
public class LibraryController {
    final LibraryService libraryService;
    LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping(path = {"/users", "/", ""})
    public List<Library> getAllLibraryUsers(@RequestParam int active) {
        return libraryService.findAllLibraryUsers(active);
    }

    @PostMapping("/{name}")
    public List<Library> getUserByName(@PathVariable String name) {
        return libraryService.findUserByNameContaining(name);
    }

    @PostMapping("/add")
    public List<Library> getUserStatus(@PathVariable String name) {
        return libraryService.findUserByNameContaining(name);
    }

    @GetMapping("/status/{status}")
    public List<Library> getUsersByStatus(@PathVariable int status) {
        return libraryService.findUserByStatus(status);
    }
}
