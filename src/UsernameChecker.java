import java.util.HashMap;

public class UsernameChecker {

    HashMap<String, Integer> users = new HashMap<>();

    public boolean checkAvailability(String username) {
        return !users.containsKey(username);
    }

    public void registerUser(String username, int id) {
        users.put(username, id);
    }
}