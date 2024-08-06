package batch.org.springweb.example;
import org.springframework.stereotype.Service;

@Service
public class DAOServiceImpl extends AbstractDAOService {

    public DAOServiceImpl(JdbcAccess jdbcAccess) {
        super(jdbcAccess);
    }

    @Override
    public void performDatabaseOperation() {
        // Implementation using jdbcAccess
        jdbcAccess.someDatabaseMethod();
    }
}
