package com.van.bootdata;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@SpringBootTest
class BootDataApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList("select * from test.person");
        for (Map<String, Object> map : mapList) {
            System.out.println(map);
        }
    }

}
