import java.util.Scanner;

public class SecondMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        if (n < 2) {
            System.out.println("Array must contain at least two elements to find the second minimum.");
            return;
        }
        
        double[] arr = new double[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }
        
        double secondMin = findSecondMinimum(arr);
        
        if (secondMin != Double.MAX_VALUE) {
            System.out.println("The second minimum value is: " + secondMin);
        } else {
            System.out.println("There is no second minimum value.");
        }
        
        scanner.close();
    }

    public static double findSecondMinimum(double[] arr) {
        double min = Double.MAX_VALUE;
        double secondMin = Double.MAX_VALUE;

        for (double num : arr) {
            if (num < min) {
                secondMin = min; 
                min = num; 
            } else if (num > min && num < secondMin) {
                secondMin = num; 
            }
        }

        return secondMin;
    }
}
