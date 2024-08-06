package batch.org.springweb.example;

import com.example.model.Example;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ExampleMapper {
    
    @Select("SELECT * FROM example_table WHERE id = #{id}")
    Example findById(int id);

    List<Example> findAll();
}
