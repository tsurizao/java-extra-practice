package vehicle;

public class Vehicle {

    private String name;

    public Vehicle(){

    }

    public Vehicle(String name){
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Vroom vroom");
    }

    public void getName(){
        System.out.println(this.name);
    }

    public void setName(String name){
        this.name = name;
    }
}
