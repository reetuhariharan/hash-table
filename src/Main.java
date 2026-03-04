public class Main {

    public static void main(String[] args) {

        WebsiteAnalytics analytics = new WebsiteAnalytics();

        analytics.visitPage("/home");
        analytics.visitPage("/home");
        analytics.visitPage("/about");

        analytics.showStats();

    }
}