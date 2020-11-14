package uk.co.mahfuz.springboot.model;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class PersonTests {
    // https://dzone.com/articles/jackson-annotations-for-json-part-4-general
    @Test
    public void test_Person() throws JsonProcessingException {
        UUID id = UUID.randomUUID();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = String.format("{\"id\": \"%s\", \"name\": \"%s\"}", id.toString(), "Mahfuz Ali");
        Person p = objectMapper.readValue(jsonString, Person.class);
        Assertions.assertEquals("Mahfuz Ali", p.getName());
    }
}
