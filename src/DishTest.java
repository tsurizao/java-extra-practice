public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish(79, "a mouthwatering slice of crispy bacon", true);
        Dish dish2 = new Dish(99, "searing hot ghost pepper popper", true);
        dish1.printSummary();
        dish2.printSummary();
    }
}
