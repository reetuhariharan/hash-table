import java.util.HashMap;

public class PlagiarismDetector {

    HashMap<String, Integer> wordFrequency = new HashMap<>();

    // Add words from document
    public void addDocument(String text) {

        String[] words = text.split(" ");

        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
    }

    // Check similarity
    public int checkSimilarity(String text) {

        String[] words = text.split(" ");
        int match = 0;

        for (String word : words) {
            if (wordFrequency.containsKey(word)) {
                match++;
            }
        }

        return match;
    }
}