public class Main {

    public static void main(String[] args) {

        PlagiarismDetector detector = new PlagiarismDetector();

        detector.addDocument("java is easy to learn");

        int result = detector.checkSimilarity("java is powerful");

        System.out.println("Matching words: " + result);

    }
}