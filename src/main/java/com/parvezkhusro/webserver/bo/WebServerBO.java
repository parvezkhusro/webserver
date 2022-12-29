package com.parvezkhusro.webserver.bo;

import com.parvezkhusro.webserver.dao.WebServerJdbcTDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebServerBO {
    private static final Logger log = LoggerFactory.getLogger(WebServerBO.class);
    final WebServerJdbcTDAO webServerDAO;

    @Autowired
    public WebServerBO(WebServerJdbcTDAO webServerDAO) {
        this.webServerDAO = webServerDAO;
    }

    public int testJdbc() {
        return webServerDAO.testJdbc();
    }

    public boolean addJdbc(String param, String value) {
        return webServerDAO.add(param, value);
    }
}
