package batch.org.springweb.examples;
import org.springframework.stereotype.Component;

@Component
public class OracleDataAccess implements JdbcAccess {

    @Override
    public void someDatabaseMethod() {
        // Oracle database interaction logic
        System.out.println("Oracle database interaction");
    }
}
