import java.util.*;

public class StockMarketMin {
    public static List<Integer> minStockPrices(int[] prices, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < prices.length; i++) {
            // Remove elements that are out of the current window
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }

            // Maintain increasing order in deque
            while (!deque.isEmpty() && prices[deque.peekLast()] > prices[i]) {
                deque.pollLast();
            }

            deque.addLast(i);

            // Start adding results when the first window is ready
            if (i >= k - 1) {
                result.add(prices[deque.peekFirst()]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] stockPrices = {120, 110, 115, 100, 105, 98, 102};
        int k = 3;
        System.out.println(minStockPrices(stockPrices, k)); // [110, 100, 100, 98, 98]
    }
}
