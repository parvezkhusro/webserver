package com.parvezkhusro.bo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class WebServerBO {
    private static final Logger log = LoggerFactory.getLogger(WebServerBO.class);

    public String view() {
        log.debug("In view");
        return "Hi";
    }
}
