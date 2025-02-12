import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static Map<String, Integer> countWordFrequency(String paragraph) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = paragraph.split("\\s+"); // Split by whitespace

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }

    public static void main(String[] args) {
        String input = "the cat and the hat";
        System.out.println(countWordFrequency(input));
    }
}
