package vehicle;

public class GarageTest {
    public static void main(String[] args) {
        Garage myGarage = new Garage("My Garage");

        Vehicle[] cars = new Vehicle[3];
        cars[0] = new Motorcycle("Hayabusa");
        cars[1] = new Car("Montecarlo");
        cars[2] = new Clunker("Pinto");
        myGarage.setVehicles(cars);
        myGarage.retrieveVehicles();
    }
}