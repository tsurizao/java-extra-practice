// 1. Create a class called Practice with a main method.
public class Practice {
    public static void main(String[] args) {
        //exercise tests

        //2
        System.out.println("Expected 2: " + subtractTen(12));

        //3
        int[] myIntArray = new int[]{5, 7, 2, 23, 13};
        System.out.println("Expected 10.0: " + average(myIntArray));

        //4 & 5
        Pet pet = new Pet("Polly", "Parakeet");
        System.out.println(pet.getName() + " is a " + pet.getType());

        PetDog sammy = new PetDog("Mimi", "Miniature Schnauzer", true);
        System.out.println(sammy.getName() + " is a " + sammy.getType() + " and it is " + sammy.isTrained() + " that it is trained.");
    }

    //2. Create a public static method in the Practice class called *subtractTen* that takes one integer argument and returns that number minus 10.
    public static int subtractTen(int num) {
        return num - 10;
    }

    //3. Create a public static method *average* in the Practice class that takes an array of integers and returns their average as a double.
    public static double average(int[] array) {
        double total = 0;
        for (int arrNum : array) {
            total += arrNum;
        }
        return total / array.length;
    }
}
