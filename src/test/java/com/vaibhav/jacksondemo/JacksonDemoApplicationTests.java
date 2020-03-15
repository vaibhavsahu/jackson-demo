package com.vaibhav.jacksondemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JacksonDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void whenDeserializingUsingJsonCreator_thenCorrect() throws JsonProcessingException {
        String json = "{ \"id\" : 1, \"theName\" : \"test\" }";
        SpringBean bean = new ObjectMapper()
                .readerFor(SpringBean.class)
                .readValue(json);
        assertEquals("test", bean.getName());
    }
}



