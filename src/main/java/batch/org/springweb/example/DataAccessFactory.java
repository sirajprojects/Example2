package batch.org.springweb.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataAccessFactory {

    private final JdbcDataAccess jdbcDataAccess;

    @Autowired
    public DataAccessFactory(JdbcDataAccess jdbcDataAccess) {
        this.jdbcDataAccess = jdbcDataAccess;
    }

    public JdbcAccess createJdbcAccess() {
        return jdbcDataAccess;
    }
}
