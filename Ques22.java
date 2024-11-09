import java.util.Arrays;
import java.util.Scanner;

public class Ques22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];

        // Input: Elements of the array
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Sort the array
        Arrays.sort(numbers);

        // Find the median
        double median;
        if (n % 2 == 0) {
            median = (numbers[n/2 - 1] + numbers[n/2]) / 2.0;
        } else {
            median = numbers[n/2];
        }

        System.out.println("The median is: " + median);

        scanner.close();
    }
}

    

