import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Enter numbers separated by commas
        System.out.print("Enter numbers separated by commas (e.g., 1,2,3): ");
        String input = scanner.nextLine();
        
        // Input: Enter the count for duplicates
        System.out.print("Enter the count for duplicates: ");
        int count = scanner.nextInt();

        // Split the input string into an array of strings
        String[] numbers = input.split(",");

        // Create a list to hold the result
        List<Integer> result = new ArrayList<>();

        // Loop through each number and add it to the result list 'count' times
        for (String number : numbers) {
            // Trim whitespace and parse the number
            int num = Integer.parseInt(number.trim());
            for (int i = 0; i < count; i++) {
                result.add(num);
            }
        }

        // Print the result
        System.out.println("Result: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
