package com.parvezkhusro.controller;

import com.parvezkhusro.bo.WebServerBO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class WebServerController {
    private static final Logger log = LoggerFactory.getLogger(WebServerController.class);

    final WebServerBO webServerBO;

    @Autowired
    public WebServerController(WebServerBO webServerBO) {
        this.webServerBO = webServerBO;
    }

    @GetMapping(path = "/hi")
    public String hi() {
        log.debug("In hi");
        return webServerBO.view();
    }
}
