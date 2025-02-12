import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static String removeDuplicateCharacters(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (seen.add(c)) { // Add only if not present in the set
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "banana";
        System.out.println(removeDuplicateCharacters(input));
    }
}
