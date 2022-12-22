package com.parvezkhusro.webserver.controller;

import com.parvezkhusro.webserver.bo.WebServerBO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class WebServerController {
    private static final Logger log = LoggerFactory.getLogger(WebServerController.class);

    final WebServerBO webServerBO;

    @Autowired
    public WebServerController(WebServerBO webServerBO) {
        this.webServerBO = webServerBO;
    }

    @GetMapping(path = "/jdbc")
    public int testJdbc() {
        return webServerBO.testJdbc();
    }

    @PostMapping(path = "/add")
    public boolean addJdbc(@RequestParam String param, @RequestParam String value) {
        return webServerBO.addJdbc(param, value);
    }
}
