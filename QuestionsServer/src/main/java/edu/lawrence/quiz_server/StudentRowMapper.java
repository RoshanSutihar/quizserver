package edu.lawrence.quiz_server;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet row, int rowNum) throws SQLException {
        Student q = new Student();
        q.setId(row.getInt("id"));
        q.setName(row.getString("name"));
        return q;
    }
}
