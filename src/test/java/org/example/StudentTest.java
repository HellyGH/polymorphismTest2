package org.example;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;




public class StudentTest {

    @Test
    @ParameterizedTest
    public void testStudentPrintDetailsMethod() {
        Student student = new Student("John Doe", 20, 85.5);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        student.PrintDetails();


        System.setOut(System.out);

        String expectedOutput = "Student: John Doe age:20 grade:85.5" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

  
}






}
