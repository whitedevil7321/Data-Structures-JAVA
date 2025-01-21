public class findMissing {
    public static void main(String[] args) {
        int[] array = {1, 2, 3,4, 5, 6, 7, 8, 9}; // Missing 4
        int maxItem = 0;

        // Find the maximum value in the array
        for (int num : array) {
            if (num > maxItem) {
                maxItem = num;
            }
        }

        findMissing missingChecker = new findMissing();
        boolean result = missingChecker.isMissing(array, maxItem);

        if (result) {
            System.out.println("There is a missing element in the array.");
        } else {
            System.out.println("There is no missing element in the array.");
        }
    }

    boolean isMissing(int[] array, int maxItem) {
        // Create a boolean array to track numbers
        boolean[] present = new boolean[maxItem + 1];

        // Mark the numbers that are present in the array
        for (int num : array) {
            present[num] = true;
        }

        // Check if any number in the range is missing
        for (int i = 1; i <= maxItem; i++) {
            if (!present[i]) {
                return true; // Missing number found
            }
        }

        return false; // No missing numbers
    }
}
