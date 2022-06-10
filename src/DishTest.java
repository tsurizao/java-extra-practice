public class DishTest {
    public static void main(String[] args) {
        Dish dish = new Dish();
        Dish dish1 = new Dish(79, "a mouthwatering slice of crispy bacon", true);
        Dish dish2 = new Dish(99, "searing hot ghost pepper popper", true);
        System.out.println();
        dish.setNameOfDish("a glass of water");
        dish.setCostInCents(39);
        dish.setWouldRecommend(true);
        dish.printSummary();
        dish1.printSummary();
        dish2.printSummary();
        System.out.println();
        DishTools.shoutDishName(dish2);
        DishTools.analyzeDishCost(dish2);

        Dish dish3 = new Dish(15000, "Dog food", false);
        DishTools.shoutDishName(dish3);
        DishTools.analyzeDishCost(dish3);
        System.out.println();
        dish2.printSummary();
        DishTools.flipRecommendation(dish2);
        dish2.printSummary();
    }
}
