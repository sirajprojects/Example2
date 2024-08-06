package batch.org.springweb.examples;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataAccessFactory {

    private final JdbcAccess jdbcAccess;

    @Autowired
    public DataAccessFactory(JdbcAccess jdbcAccess) {
        this.jdbcAccess = jdbcAccess;
    }

    public JdbcAccess createJdbcAccess() {
        return jdbcAccess;
    }
}
