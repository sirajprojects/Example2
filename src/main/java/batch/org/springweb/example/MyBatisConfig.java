package batch.org.springweb.example;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.mapper")
public class MyBatisConfig {
}
