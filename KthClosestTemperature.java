import java.util.Random;

public class KthClosestTemperature {

    public static int findKthClosest(int[] readings, int target, int k) {
        return quickSelect(readings, target, 0, readings.length - 1, k - 1);
    }

    private static int quickSelect(int[] readings, int target, int left, int right, int k) {
        if (left == right) return readings[left];

        Random rand = new Random();
        int pivotIndex = left + rand.nextInt(right - left + 1);
        pivotIndex = partition(readings, target, left, right, pivotIndex);

        if (k == pivotIndex) {
            return readings[k];
        } else if (k < pivotIndex) {
            return quickSelect(readings, target, left, pivotIndex - 1, k);
        } else {
            return quickSelect(readings, target, pivotIndex + 1, right, k);
        }
    }

    private static int partition(int[] readings, int target, int left, int right, int pivotIndex) {
        int pivotValue = readings[pivotIndex];
        int pivotDistance = Math.abs(pivotValue - target);

        // Move pivot to the end
        swap(readings, pivotIndex, right);
        int storeIndex = left;

        for (int i = left; i < right; i++) {
            if (Math.abs(readings[i] - target) < pivotDistance) {
                swap(readings, storeIndex, i);
                storeIndex++;
            }
        }

        // Move pivot to its final place
        swap(readings, storeIndex, right);
        return storeIndex;
    }

    private static void swap(int[] readings, int i, int j) {
        int temp = readings[i];
        readings[i] = readings[j];
        readings[j] = temp;
    }

    public static void main(String[] args) {
        int[] readings = {72, 75, 68, 80, 74};
        int target = 73, k = 2;

        System.out.println(findKthClosest(readings, target, k)); // Output: 74
    }
}
