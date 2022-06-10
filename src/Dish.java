public class Dish {
    int costInCents;
    String nameOfDish;
    boolean wouldRecommend;

    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend){
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }
    public void printSummary(){
        System.out.printf("Cost: $0.%s \nName: %s \nRecommended: %s\n", costInCents, nameOfDish, wouldRecommend);
    }
}
