import java.util.HashMap;

public class MultiLevelCache {

    HashMap<String, String> L1Cache = new HashMap<>();
    HashMap<String, String> L2Cache = new HashMap<>();

    public String getVideo(String videoId) {

        if (L1Cache.containsKey(videoId)) {
            return "L1 Cache HIT: " + L1Cache.get(videoId);
        }

        if (L2Cache.containsKey(videoId)) {
            String video = L2Cache.get(videoId);
            L1Cache.put(videoId, video); // promote to L1
            return "L2 Cache HIT: " + video;
        }

        return "Cache MISS";
    }

    public void addVideo(String videoId, String data) {
        L2Cache.put(videoId, data);
    }
}