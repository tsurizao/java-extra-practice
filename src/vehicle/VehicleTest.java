package vehicle;

import vehicle.Car;

public class VehicleTest {

    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Chevelle");
        car.getName();
        car.makeNoise();
        Motorcycle moto = new Motorcycle();
        moto.makeNoise();
    }
}
