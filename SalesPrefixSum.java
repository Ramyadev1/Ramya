class SalesPrefixSum {
    // Method to compute the prefix sum of sales
    int[] computePrefixSum(int[] sales) {
        int[] prefixSum = new int[sales.length];
        prefixSum[0] = sales[0];
        
        for (int i = 1; i < sales.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + sales[i];
        }
        
        return prefixSum;
    }

    public static void main(String[] args) {
        // Create an instance of the class
        SalesPrefixSum salesCalculator = new SalesPrefixSum();
        
        // Example input array
        int[] sales = {10, 20, 15, 30, 25};
        
        // Compute the prefix sum
        int[] prefixSum = salesCalculator.computePrefixSum(sales);
        
        // Display the prefix sum
        System.out.print("PrefixSum[] = [");
        for (int i = 0; i < prefixSum.length; i++) {
            System.out.print(prefixSum[i] + (i < prefixSum.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
