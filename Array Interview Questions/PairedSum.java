import java.util.ArrayList;
import java.util.List;

public class PairedSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        PairedSum checksum = new PairedSum();
        ArrayList<String> result = checksum.checksum(array, 10);

        // Print the result
        for (String pair : result) {
            System.out.println(pair);
        }
    }

    ArrayList<String> checksum(int array[], int sum) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) { // Avoid duplicate pairs
                if (array[i] + array[j] == sum) {
                    result.add("[" + array[i] + ", " + array[j] + "]");
                }
            }
        }

        return result;
    }
}
