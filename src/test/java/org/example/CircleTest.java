package org.example;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @ParameterizedTest
    @MethodSource
    @Test
    public void testArea_and_Perimeter(){
        /**
         * program for find the area and perimeter of circle
         * @param radius-radius
         * @return-area of circle
         * @return-perimeter of circle
         */
        var circle = new Circle(3);
        assertEquals(28.27, circle.area(), 0.01);
        assertEquals(18.84,circle.perimeter(),0.01);

    }
}
