import java.util.HashMap;

public class HashmapPractice {
    public static void main(String[] args) {
        HashMap<String, String> usernames = new HashMap<>();

        usernames.put("Ryan", "ryanorsinger");
        usernames.put("Chase", "tsurizao");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Zach", "zgulde");
        usernames.put("Justin", "jreich5");

        System.out.println(usernames);

        System.out.println(usernames.get("Ryan"));
        System.out.println(usernames.get("Chase"));
        System.out.println(usernames.getOrDefault("Jason", "gocodeup"));

        System.out.println(usernames.containsKey("Justin"));
        System.out.println(usernames.containsValue("tsurizao"));
    }
}
