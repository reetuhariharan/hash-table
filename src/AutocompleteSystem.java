import java.util.HashMap;

public class AutocompleteSystem {

    HashMap<String, Integer> searchQueries = new HashMap<>();

    public void addQuery(String query) {
        searchQueries.put(query, searchQueries.getOrDefault(query, 0) + 1);
    }

    public void suggest(String prefix) {

        for (String query : searchQueries.keySet()) {
            if (query.startsWith(prefix)) {
                System.out.println(query + " (" + searchQueries.get(query) + ")");
            }
        }
    }
}