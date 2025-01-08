import java.util.Scanner;

class checkNumber{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Correct array initialization

        System.out.println("Enter the Number:"); // Fixed the missing semicolon
        int number = sc.nextInt();

        boolean found = false; // Flag to track if the number is found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("Number Found at: " + i + " Position"); // Fixed missing semicolon
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found");
        }

        sc.close(); // Close the scanner
    }
}
