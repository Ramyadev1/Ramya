import java.util.Arrays;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        // Count frequency of characters in s1
        for (char c : s1.toCharArray()) {
            s1Freq[c - 'a']++;
        }

        int windowSize = s1.length();
        
        // Initial window in s2
        for (int i = 0; i < windowSize; i++) {
            s2Freq[s2.charAt(i) - 'a']++;
        }

        // Slide the window over s2
        for (int i = 0; i <= s2.length() - windowSize; i++) {
            if (Arrays.equals(s1Freq, s2Freq)) return true; // Found a permutation
            
            if (i + windowSize < s2.length()) {
                s2Freq[s2.charAt(i) - 'a']--; // Remove leftmost char
                s2Freq[s2.charAt(i + windowSize) - 'a']++; // Add new char
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo")); // true
        System.out.println(checkInclusion("ab", "eidboaoo")); // false
    }
}
