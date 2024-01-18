package org.example;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    private Car car;
 @ParameterizedTest
 @CsvSource({
         "Audi,10,40,100",
         "BMW,12,45,80",
         "Toyota,30,40,90"
 })

 public void testConstructorWithParameters(String brand, int speed, int fuel, int mileage){
        car = new Car(brand,speed,fuel,mileage);
        Assertions.assertEquals(brand, car.getBrand());
        Assertions.assertEquals(speed,car.getSpeed());
        Assertions.assertEquals(fuel,car.getFuel());
        Assertions.assertEquals(mileage,car.getMileage());
    }
    @Test
    @ParameterizedTest
    @CsvSource({
            "Audi,10,40,100",
            "BMW,12,45,80",
            "Toyota,30,40,90"
    })

    public void TestDriveMethod(int distance){
       car = new Car(car.brand, car.speed, car.fuel, car.mileage);
       car.drive(distance);
       Assertions.assertEquals(car.mileage, car.getMileage());
       Assertions.assertEquals(car.brand,car.getFuel());
 }
    @Test
    @ParameterizedTest
    @CsvSource({
            "Audi,10,40,100",
            "BMW,12,45,80",
            "Toyota,30,40,90"
    })
    
    public void TestRefuelMethod(double amount){
        car = new Car(car.brand, car.speed, car.fuel, car.mileage);
        car.refuel(amount);
        Assertions.assertEquals(car.fuel,car.getFuel());
        
    }
    @ParameterizedTest
    public void TestAccelerateMethod(){

        double oldSpeed = car.getSpeed();
        double newSpeed = car.accelerate();

        Assertions.assertEquals((oldSpeed + 4.0), newSpeed, "Speed should be increased by 10");

    }

}
