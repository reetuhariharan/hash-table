public class Main {

    public static void main(String[] args) {

        RateLimiter limiter = new RateLimiter();

        limiter.request("user1");
        limiter.request("user1");
        limiter.request("user1");
        limiter.request("user1");
        limiter.request("user1");
        limiter.request("user1");

    }
}