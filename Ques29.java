import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques29 {
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

        // Map to store frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Find duplicates and their frequency
        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        // Print duplicate elements and their frequency
        System.out.println("Duplicate elements and their frequency:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
            }
        }

        scanner.close();
    }
}

    

