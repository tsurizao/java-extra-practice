package vehicle;

public class Garage {
    private String name;
    private Vehicle[] vehicles;

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }
    public Garage (){

    }

    public Garage(String name){
        this.name = name;
    }

    public void retrieveVehicles(){
        for(Vehicle vehicle: vehicles){
            vehicle.makeNoise();
        }
    }
}