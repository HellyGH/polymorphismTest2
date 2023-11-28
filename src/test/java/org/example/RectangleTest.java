package org.example;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    public void testAreaAndPerimeter(){
        var rectangle=new Rectangle(3,4);
        assertEquals(12,rectangle.area(),0.01);
        assertEquals(14,rectangle.perimeter(),0.01);
    }


}