public class DebitTransactionCounter {
    public static void main(String[] args) {
        double[] transactions = {900, 1500, 600, 1200, 400}; // Example array of transactions
        int debitCount = countDebits(transactions);
        
        System.out.println("Number of debit transactions: " + debitCount);
    }

    public static int countDebits(double[] transactions) {
        int count = 0;

        for (double transaction : transactions) {
            if (transaction <= 600) { // Check if the transaction is considered a debit
                count++;
            }
        }

        return count;
    }
}
