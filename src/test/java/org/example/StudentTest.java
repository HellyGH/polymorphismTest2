package org.example;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;


public class StudentTest {
    @Test
    public void testConstructorWithParameters(){
        var p=new Person("Helly",15,5.57);
        assertEquals("Helly",p.getName());
        assertEquals(20,p.getAge());
         assertEquals(5.57,p.getGrade());
    }
    @Test
    public void testPrintable(){
        var p=new Person("Helly",15,5.57);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        p.PrintDetails();
        assertEquals("Person:Helly,age:20,grade:5.57\n", outputStream.toString());
        System.setOut(System.out);





    }



}
