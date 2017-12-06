package profchoper.slot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
@SuppressWarnings("unchecked")
public class SlotDAO {
    @Autowired
    @Qualifier("profChoperDataSource")
    private DataSource dataSource;

    public List<Slot> findAll() {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        String selectSQL = "SELECT * FROM bookings ORDER BY start_time, professor_alias";

        return select.query(selectSQL, new SlotRowMapper());
    }

    public List<Slot> findByProfAlias(String profAlias) {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        String selectSQL = "SELECT * FROM bookings WHERE professor_alias = ?";

        return select.query(selectSQL, new Object[]{profAlias}, new SlotRowMapper());
    }
}
