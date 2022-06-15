package vehicle;

public class GarageTest {
    public static void main(String[] args) {
        Garage myGarage = new Garage("My Garage");

        Vehicle[] myCars = new Vehicle[3];
        myCars[0] = new Motorcycle("Hayabusa");
        myCars[1] = new Car("Montecarlo");
        myCars[2] = new Clunker("Pinto");
        myGarage.setVehicles(myCars);
        myGarage.retrieveVehicles();
    }
}