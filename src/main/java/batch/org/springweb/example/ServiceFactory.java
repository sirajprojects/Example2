package batch.org.springweb.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceFactory {

    private final DataAccessFactory dataAccessFactory;

    @Autowired
    public ServiceFactory(DataAccessFactory dataAccessFactory) {
        this.dataAccessFactory = dataAccessFactory;
    }

    public DAOService createDAOService() {
        return new DAOServiceImpl(dataAccessFactory.createJdbcAccess());
    }
}
