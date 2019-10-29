package profchoper.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@SuppressWarnings("unchecked")
public class StudentRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Student> findAll() {
        String selectSQL = "SELECT s.id as s_id, s.name as s_name, s.email as s_email, " +
                "c1.id as c1_id, c1.name as c1_name, c1.alias as c1_alias, " +
                "c2.id as c2_id, c2.name as c2_name, c2.alias as c2_alias," +
                "c3.id as c3_id, c3.name as c3_name, c3.alias as c3_alias," +
                "c4.id as c4_id, c4.name as c4_name, c4.alias as c4_alias " +
                "FROM students s " +
                "JOIN courses c1 ON s.course1_id = c1.id " +
                "JOIN courses c2 ON s.course2_id = c2.id " +
                "JOIN courses c3 ON s.course3_id = c3.id " +
                "JOIN courses c4 ON s.course4_id = c4.id " +
                "ORDER BY s_id";

        return jdbcTemplate.query(selectSQL, new StudentRowMapper());
    }

    public Student findById(int id) {
        String selectSQL = "SELECT s.id as s_id, s.name as s_name, s.email as s_email, " +
                "c1.id as c1_id, c1.name as c1_name, c1.alias as c1_alias, " +
                "c2.id as c2_id, c2.name as c2_name, c2.alias as c2_alias," +
                "c3.id as c3_id, c3.name as c3_name, c3.alias as c3_alias," +
                "c4.id as c4_id, c4.name as c4_name, c4.alias as c4_alias " +
                "FROM students s " +
                "JOIN courses c1 ON s.course1_id = c1.id " +
                "JOIN courses c2 ON s.course2_id = c2.id " +
                "JOIN courses c3 ON s.course3_id = c3.id " +
                "JOIN courses c4 ON s.course4_id = c4.id " +
                "WHERE s.id = ?";

        return (Student) jdbcTemplate.queryForObject(selectSQL, new Object[]{id},
                new StudentRowMapper());
    }

    public Student findByEmail(String email) {
        String selectSQL = "SELECT s.id as s_id, " +
                "s.name as s_name, s.email as s_email, " +
                "c1.id as c1_id, c1.name as c1_name, c1.alias as c1_alias, " +
                "c2.id as c2_id, c2.name as c2_name, c2.alias as c2_alias," +
                "c3.id as c3_id, c3.name as c3_name, c3.alias as c3_alias," +
                "c4.id as c4_id, c4.name as c4_name, c4.alias as c4_alias " +
                "FROM students s " +
                "JOIN courses c1 ON s.course1_id = c1.id " +
                "JOIN courses c2 ON s.course2_id = c2.id " +
                "JOIN courses c3 ON s.course3_id = c3.id " +
                "JOIN courses c4 ON s.course4_id = c4.id " +
                "WHERE s.email = ?";

        return (Student) jdbcTemplate.queryForObject(selectSQL, new Object[]{email},
                new StudentRowMapper());
    }
}
