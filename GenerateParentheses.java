import java.util.*;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) { // Base condition
            result.add(current);
            return;
        }

        if (open < max) { // Add '(' if open count is less than n
            backtrack(result, current + "(", open + 1, close, max);
        }
        if (close < open) { // Add ')' only if it doesn’t exceed '(' count
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3)); // ["((()))", "(()())", "(())()", "()(())", "()()()"]
        System.out.println(generateParenthesis(1)); // ["()"]
    }
}
