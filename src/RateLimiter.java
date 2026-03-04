import java.util.HashMap;

public class RateLimiter {

    HashMap<String, Integer> requestCount = new HashMap<>();
    int limit = 5;

    public void request(String user) {

        int count = requestCount.getOrDefault(user, 0);

        if (count < limit) {
            requestCount.put(user, count + 1);
            System.out.println("Request allowed for " + user);
        } else {
            System.out.println("Rate limit exceeded for " + user);
        }
    }
}