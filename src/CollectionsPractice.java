import java.util.HashMap;

public class CollectionsPractice {
    public static void main(String[] args) {
        HashMap<String, String> usernames = new HashMap<>();
        usernames.put("Chase", "tsurizao");

        System.out.println(usernames);
        usernames.putIfAbsent("Zach", "zgulde");
        usernames.putIfAbsent("Alfredo", "noonchio");
        System.out.println(usernames);

        usernames.remove("Zach");
        System.out.println(usernames);

        usernames.replace("Alfredo", "bruh");
        System.out.println(usernames);

        usernames.clear();
        System.out.println(usernames.isEmpty());
    }
}
