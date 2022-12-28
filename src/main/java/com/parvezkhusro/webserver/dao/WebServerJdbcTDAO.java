package com.parvezkhusro.webserver.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class WebServerJdbcTDAO {
    private static final Logger log = LoggerFactory.getLogger(WebServerJdbcTDAO.class);
    final JdbcTemplate jdbcTemplate;

    @Autowired
    public WebServerJdbcTDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int testJdbc() {
        log.debug("In testJdbc()");
        int count = 0;
        try{
            count = jdbcTemplate.queryForObject("select count(*) from foo", Integer.class);
        } catch(Exception e){
            log.error("Exception: ", e);
        }
        return count;
    }

    public boolean add(String param, String value) {
        log.debug("In add()");
        int rows = 0;
        try{
            rows = jdbcTemplate.update("insert into foo (param, value) values (?, ?)", param, value);
        } catch(Exception e){
            log.error("Exception: ", e);
        }
        return rows > 0;
    }
}
