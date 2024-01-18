package org.example;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ElectricCarTest {
   private ElectricCar electricCar;
    @ParameterizedTest
    @CsvSource({
            "Tesla,100,0,100,50,50",
           
    })
    public void TestConstructorWithParameter(String brand, int speed, int fuel,int mileage,int batteryLevel,int efficiency){
       electricCar = new ElectricCar(brand,speed,fuel,mileage,batteryLevel,efficiency);
        Assertions.assertEquals(brand,electricCar.getBrand());
        Assertions.assertEquals(speed,electricCar.getSpeed());
        Assertions.assertEquals(fuel,electricCar.getFuel());
        Assertions.assertEquals(mileage,electricCar.getMileage());
        Assertions.assertEquals(batteryLevel,electricCar.getBatteryLevel());
        Assertions.assertEquals(efficiency,electricCar.getEfficiency());
    }

    @Test
    @ParameterizedTest
    @CsvSource({
            "Tesla,100,0,100,50,50",

    })
    public void TestChargeMethod(double amount){
        electricCar = new ElectricCar(electricCar.brand, electricCar.speed,electricCar.fuel,electricCar.mileage,electricCar.batteryLevel, electricCar.efficiency);
        electricCar.charge(amount);
       Assertions.assertEquals(electricCar.batteryLevel,electricCar.getBatteryLevel());
    }

    @ParameterizedTest
    @CsvSource({
            "Tesla,100,0,100,50,50",

    })
    public void TestDriveElCarMethod(int distance){
        electricCar = new ElectricCar(electricCar.brand, electricCar.speed,electricCar.fuel,electricCar.mileage,electricCar.batteryLevel, electricCar.efficiency); 
        electricCar.driveElectricCar(distance);
       Assertions.assertEquals(electricCar.batteryLevel,electricCar.getBatteryLevel());

    }
}
