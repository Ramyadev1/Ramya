class FuelPostfixSum {
    // Method to compute the postfix sum of fuel consumption
    int[] computePostfixSum(int[] fuel) {
        int[] postfixSum = new int[fuel.length];
        postfixSum[fuel.length - 1] = fuel[fuel.length - 1];
        
        for (int i = fuel.length - 2; i >= 0; i--) {
            postfixSum[i] = postfixSum[i + 1] + fuel[i];
        }
        
        return postfixSum;
    }

    public static void main(String[] args) {
        // Create an instance of the class
        FuelPostfixSum fuelCalculator = new FuelPostfixSum();
        
        // Example input array
        int[] fuel = {5, 10, 3, 7, 8};
        
        // Compute the postfix sum
        int[] postfixSum = fuelCalculator.computePostfixSum(fuel);
        
        // Display the postfix sum
        System.out.print("PostfixSum[] = [");
        for (int i = 0; i < postfixSum.length; i++) {
            System.out.print(postfixSum[i] + (i < postfixSum.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
