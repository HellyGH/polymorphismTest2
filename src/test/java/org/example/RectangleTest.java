package org.example;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    @ParameterizedTest
    @MethodSource
    public void testAreaAndPerimeter(){
        /**
         * program for find the area and perimeter of rectangle
         * @param length-length
         * @param width-width
         * @return - area and perimeter
         */
        var rectangle=new Rectangle(3,4);
        assertEquals(12,rectangle.area(),0.01);
        assertEquals(14,rectangle.perimeter(),0.01);
    }


}
