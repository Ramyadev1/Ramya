public class HighestSalesDay {
    public static void main(String[] args) {
        // Sample sales data (sales for each day of the week)
        int[] sales = {500, 700, 1200, 1500, 900, 1800, 1100};

        // Find the day with the highest sales
        int maxSales = sales[0];
        int maxDay = 0;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                maxDay = i;
            }
        }

        System.out.println("The day with the highest sales is Day " + (maxDay + 1) + " with sales of " + maxSales);
    }
}
