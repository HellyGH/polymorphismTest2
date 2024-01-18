package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class PersonTest {
    private Person person;
    @Test
    @ParameterizedTest
    @CsvSource({
            "Helly,20",
            "Teo,18",
            "Katrin,28"

    })
    public void testConstructorWithParameters(String name, int age) {
        person = new Person(name,age);
        Assertions.assertEquals(name,person.getName());
        Assertions.assertEquals(age,person.getAge());

    }


}
