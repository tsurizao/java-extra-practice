package vehicle;

import vehicle.Car;

public class VehicleTest {

    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Chevelle");
        car.getName();
        car.makeNoise();
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.makeNoise();
        Clunker clunker = new Clunker();
        clunker.breakingDownNoise();
    }
}
