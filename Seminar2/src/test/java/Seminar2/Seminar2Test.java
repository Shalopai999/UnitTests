package Seminar2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Seminar2Test {
    private static Car car;
    private static Motorcycle motorcycle;

    @BeforeAll
    public static void createObjetsForTest(){
        car = new Car("SomeCompany", "SomeModel", 2023);
        motorcycle = new Motorcycle("SomeCompany", "SomeModel", 2023);
    }

    @Test
    public void carShouldVehicleObject(){
        assertTrue(car instanceof Seminar2);
    }

    @Test
    public void carShouldHaveFourWheels(){
        int expectedWheels = 4;
        int actualWheels = car.getNumWheels();
        assertEquals(expectedWheels,
                actualWheels, "Конструктор класса Car некорректен, кол-во колес не равно 4");
    }

    @Test
    public void motorcycleShouldHaveFourWheels(){
        int expectedWheels = 2;
        int actualWheels = motorcycle.getNumWheels();
        assertEquals(expectedWheels,
                actualWheels, "Конструктор класса Motorcycle некорректен, кол-во колес не равно 4");
    }

    @Test
    public void carShouldDriveWithCorrectSpeed(){
        int expectedSpeed = 60;
        car.testDrive();
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed,
                actualSpeed, "Метод testDrive() некорректен, скорость машины не равна 60");
    }

    @Test
    public void motorcycleShouldDriveWithCorrectSpeed(){
        int expectedSpeed = 75;
        motorcycle.testDrive();
        int actualSpeed = motorcycle.getSpeed();
        assertEquals(expectedSpeed,
                actualSpeed, "Метод testDrive() некорректен, скорость мотоцикла не равна 60");
    }

    @Test
    public void carShouldParkWithCorrectSpeed(){
        int expectedSpeed = 0;
        car.testDrive(); //
        car.park();
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed,
                actualSpeed, "Метод park() некорректен, скорость машины не равна 0");
    }

    @Test
    public void motorcycleShouldParkWithCorrectSpeed(){
        int expectedSpeed = 0;
        motorcycle.testDrive();
        motorcycle.park();
        int actualSpeed = motorcycle.getSpeed();
        assertEquals(expectedSpeed,
                actualSpeed, "Метод park() некорректен, скорость мотоцикла не равна 0");
    }
}