package com.parvezkhusro.webserver.controller;

import com.parvezkhusro.webserver.bo.WebServerBO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    final WebServerBO webServerBO;

    @Autowired
    public UserController(WebServerBO webServerBO) {
        this.webServerBO = webServerBO;
    }

    @PostMapping("/id")
    Object getUserById(@PathVariable String id) {
        webServerBO.getUser(id);
        return null;
    }
}
