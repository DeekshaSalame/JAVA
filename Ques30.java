import java.util.Scanner;

public class Ques30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // Input: Elements of the array
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Print every alternate number
        System.out.println("Every alternate number in the array:");
        for (int i = 0; i < n; i += 2) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}

    

