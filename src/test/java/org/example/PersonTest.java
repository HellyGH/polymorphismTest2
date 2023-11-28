package org.example;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;


public class PersonTest {
    @Test
    public void testConstructorWithParameters() {
        var p = new Person("Helly", 20);
        assertEquals("Helly", p.getName());

    }
    @Test
    public void testPrintDetails() {



    }

}