package batch.org.springweb.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JdbcDataAccess implements JdbcAccess {

    private final ExampleMapper exampleMapper;

    @Autowired
    public JdbcDataAccess(ExampleMapper exampleMapper) {
        this.exampleMapper = exampleMapper;
    }

    @Override
    public void someDatabaseMethod() {
        // Use exampleMapper for database operations
        Example example = exampleMapper.findById(1);
        System.out.println(example);
    }
}
