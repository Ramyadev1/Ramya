import java.util.HashMap;

public class MostFrequentRating {
    public static void main(String[] args) {
        int[] ratings = {5, 3, 4, 5, 2, 5, 3, 4, 4, 4, 3, 5};

        HashMap<Integer, Integer> map = new HashMap<>();
        int mostFrequent = ratings[0], maxCount = 0;

        for (int rating : ratings) {
            map.put(rating, map.getOrDefault(rating, 0) + 1);
            if (map.get(rating) > maxCount) {
                maxCount = map.get(rating);
                mostFrequent = rating;
            }
        }

        System.out.println("Most frequent rating: " + mostFrequent);
    }
}
