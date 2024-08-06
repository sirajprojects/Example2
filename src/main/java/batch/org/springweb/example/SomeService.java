package batch.org.springweb.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomeService {

    private final ServiceFactory serviceFactory;

    @Autowired
    public SomeService(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    public void performAction() {
        DAOService daoService = serviceFactory.createDAOService();
        daoService.performDatabaseOperation();
    }
}
