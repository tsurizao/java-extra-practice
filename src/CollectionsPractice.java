import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsPractice {
    public static void main(String[] args) {
        ArrayList<String> games = new ArrayList<>();
        games.add("Hollow Knight");
        games.add("Dota 2");
        games.add("Counter Strike");
        games.add("Resident Evil 8");
        games.add("Red Dead Redemption 2");

        System.out.println(games);
        System.out.println(games.contains("Dota 2"));
        System.out.println(games.contains("Far Cry"));

        System.out.println(games.lastIndexOf("Counter Strike"));

        System.out.println(games.isEmpty());
        ArrayList<String> nothing = new ArrayList<>();
        System.out.println(nothing.isEmpty());

        games.remove("Dota 2");
        games.remove("Hollow Knight");
        System.out.println(games);

        games.remove(0);
        System.out.println(games);
    }
}
