package Lesson_08_Jeckson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class JacksonTest {
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void pojoToJsonString() throws JsonProcessingException {
        Employee employee = new Employee("Mark", "James", 20);

        String json = objectMapper.writeValueAsString(employee);

        System.out.println(json);
    }

    @Test
    void jsonStringToPojo() throws JsonProcessingException {
        String employeeJson = "{\n" +
                " \"firstName\" : \"Jalil\",\n" +
                " \"lastName\" : \"Jarjanazy\",\n" +
                " \"age\" : 30\n" +
                "}";

        Employee employee = objectMapper.readValue(employeeJson, Employee.class);

        //assertThat(employee.getFirstName()).isEqualTo("Jalil");

        System.out.println(employee.getFirstName());

        //String res = employee.getFirstName();
        //String actual = "Jalil";
        //Assert.assertEquals(res, actual);

    }

    @Test
    void jsonFileToPojo() throws IOException {
        File file = new File("c:\\Admin\\employee.json");

        Employee employee = objectMapper.readValue(file, Employee.class);

        System.out.println(employee.getFirstName());

        //assertThat(employee.getAge()).isEqualTo(44);
        //assertThat(employee.getLastName()).isEqualTo("Simpson");
        //assertThat(employee.getFirstName()).isEqualTo("Homer");
    }


}
