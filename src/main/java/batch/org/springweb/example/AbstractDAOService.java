package batch.org.springweb.example;
public abstract class AbstractDAOService implements DAOService {
    protected JdbcAccess jdbcAccess;

    public AbstractDAOService(JdbcAccess jdbcAccess) {
        this.jdbcAccess = jdbcAccess;
    }

    // Common database operation methods
}
