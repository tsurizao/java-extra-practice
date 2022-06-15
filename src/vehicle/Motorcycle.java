package vehicle;

public class Motorcycle extends Vehicle{
    private String name;

    public Motorcycle(){}
    public Motorcycle(String name){
        this.name = name;
    }
    @Override
    public void makeNoise() {
        System.out.println("zoooooooooooom");
    }
}
