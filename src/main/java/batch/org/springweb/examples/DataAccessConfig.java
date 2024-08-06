package batch.org.springweb.examples;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;

@Configuration
public class DataAccessConfig {

    @Value("classpath:config.xml")
    private Resource configResource;

    @Bean
    public DataAccessSettings dataAccessSettings() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(DataAccessSettings.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (DataAccessSettings) unmarshaller.unmarshal(configResource.getInputStream());
    }

    @Bean
    public JdbcAccess jdbcAccess(DataAccessSettings settings) {
        // You can add logic to instantiate the appropriate class based on settings
        if ("com.example.OracleDataAccess".equals(settings.getAccessClass())) {
            return new OracleDataAccess();
        } else {
            throw new IllegalArgumentException("Unsupported access class: " + settings.getAccessClass());
        }
    }
}
