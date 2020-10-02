package test.java.json;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import ru.sergie.json.course.ExtendableBean;
import ru.sergie.json.course.MyBean;
import ru.sergie.json.course.TypeEnumWithValue;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ExtendableBeanTest {
    @Test
    public void whenSerializingUsingJsonAnyGetter_thenCorrect()
            throws IOException {

        ExtendableBean bean = new ExtendableBean("My bean");
        bean.add("attr1", "val1");
        bean.add("attr2", "val2");

        String result = new ObjectMapper().disable(MapperFeature.USE_ANNOTATIONS).writeValueAsString(bean);

        assertThat(result, containsString("attr1"));
        assertThat(result, containsString("val1"));
        System.out.println(result);
    }
    @Test
    public void whenSerializingUsingJsonGetter_thenCorrect()
            throws IOException {

        MyBean bean = new MyBean(1, "My bean");

        String result = new ObjectMapper().writeValueAsString(bean);

        assertThat(result, containsString("My bean"));
        assertThat(result, containsString("1"));
        System.out.println(result);
    }
    @Test
    public void whenSerializingUsingJsonValue_thenCorrect()
            throws JsonParseException, IOException {

        String enumAsString = new ObjectMapper()
                .writeValueAsString(TypeEnumWithValue.TYPE1);

//        assertThat(enumAsString, is("\"Type A\""));
        System.out.println(enumAsString);

    }
}