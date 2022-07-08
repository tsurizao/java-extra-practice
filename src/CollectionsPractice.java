import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(0, 45);
        numbers.add(32);
        System.out.println(numbers);

        System.out.println(numbers.size());
        System.out.println(numbers.get(1));

        System.out.println(numbers.indexOf(32));
        System.out.println(numbers.indexOf("dog"));
    }
}
