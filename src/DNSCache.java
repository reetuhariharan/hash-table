import java.util.HashMap;

class DNSCache {

    HashMap<String, String> cache = new HashMap<>();

    // Add domain and IP
    public void addEntry(String domain, String ip) {
        cache.put(domain, ip);
    }

    // Resolve domain
    public String resolve(String domain) {

        if (cache.containsKey(domain)) {
            return "Cache HIT: " + cache.get(domain);
        } else {
            return "Cache MISS";
        }
    }

    // Remove entry
    public void removeEntry(String domain) {
        cache.remove(domain);
    }
}