public class UpperPyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pyramid

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
