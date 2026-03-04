import java.util.HashMap;

public class WebsiteAnalytics {

    HashMap<String, Integer> pageViews = new HashMap<>();

    public void visitPage(String url) {
        pageViews.put(url, pageViews.getOrDefault(url, 0) + 1);
    }

    public int getVisits(String url) {
        return pageViews.getOrDefault(url, 0);
    }

    public void showStats() {
        for (String page : pageViews.keySet()) {
            System.out.println(page + " : " + pageViews.get(page) + " visits");
        }
    }
}