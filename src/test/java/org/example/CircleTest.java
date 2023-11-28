package org.example;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    public void testAreaandP(){
        var circle = new Circle(3);
        assertEquals(28.27, circle.area(), 0.01);
        assertEquals(18.84,circle.perimeter(),0.01);

    }
}