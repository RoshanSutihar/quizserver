package edu.lawrence.quiz_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ResponseDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public String save(Response response) {

        String insertSQL = "INSERT INTO responses (student,response, question ) values (?, ?,?)";
        jdbcTemplate.update(insertSQL, Integer.parseInt(response.getStudent()),response.getResponse(), response.getQuestion());
        return "saved";
    }
}
