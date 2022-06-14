package vehicle;

public class Clunker extends Vehicle{

    public void breakingDownNoise(){
        super.makeNoise();
        System.out.println("clunk clank, pfffft");
    }
}
