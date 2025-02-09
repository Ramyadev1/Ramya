class InversionCount {
    // Instance method to count the number of inversion pairs in the array
    int countInversions(int[] arr) {
        int count = 0;
        
        // Compare each pair of elements in the array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // If a later element is smaller, it forms an inversion
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Create an instance of the class
        InversionCount inversionCounter = new InversionCount();
        
        // Example input array
        int[] P = {30, 45, 25, 60, 20};
        
        // Display the inversion count
        System.out.println("The inversion count is " + inversionCounter.countInversions(P));
    }
}
