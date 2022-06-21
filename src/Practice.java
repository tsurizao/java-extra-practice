import java.util.ArrayList;

//1 Create a class called Practice with a main method.
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

        //testing for 7, 8, 9
        PetDog sammy = new PetDog("Mimi", "Miniature Schnauzer", true);
        System.out.println(sammy.getName() + " is a " + sammy.getType() + " and it is " + sammy.isTrained() + " that it is trained.");
        System.out.println(sammy.snuggle());

        //12
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(5);
        arrList.add(6);
        arrList.add(7);
        arrList.add(8);
        arrList.add(9);
        System.out.println("Expected output 15, 18, 21, 24, 27: " + multiplyAll(3, arrList));
    }

    //2. Create a public static method in the Practice class called *subtractTen* that takes one integer argument and returns that number minus 10.
    public static int subtractTen(int num) {
        return num - 10;
    }

    //3. Create a public static method *average* in the Practice class that takes an array of integers and returns their average as a double.
    public static double average(int[] numbersArray) {
        double total = 0;
        for (int number : numbersArray) {
            total += number;
        }
        return total / numbersArray.length;
    }

    //12. In your Practice class, create a static method named multiplyAll. It should accept an integer and an ArrayList of integers. It should take the ArrayList argument and multiply all its elements by the value of the integer argument.
    public static ArrayList<Integer> multiplyAll(int num, ArrayList<Integer> arrList) {
        arrList.replaceAll(integer -> integer * num);
        return arrList;
    }
}