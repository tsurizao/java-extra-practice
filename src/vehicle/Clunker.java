package vehicle;

public class Clunker extends Vehicle {

    private String name;

    public Clunker() {
    }

    public Clunker(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("bruh rbu brbrhrbruh bruh");
    }

    public void breakingDownNoise() {
        super.makeNoise();
        System.out.println("clunk clank, pfffft");
    }
}
