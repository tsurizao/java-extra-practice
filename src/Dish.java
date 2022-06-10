public class Dish {
    int costInCents;
    String nameOfDish;
    boolean wouldRecommend;

    public Dish (){
    };

    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public void printSummary() {
        System.out.printf("Cost: %d \nName: %s \nRecommended: %b\n", costInCents, nameOfDish, wouldRecommend);
    }
}
