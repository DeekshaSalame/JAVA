import java.util.Scanner;

public class ConsecutiveDigitSum {
    public static int sumOfConsecutiveDigits(int number) {
        String numStr = Integer.toString(number);
        int sum = 0;

        // Loop through and create numbers formed by consecutive digits
        for (int i = 0; i < numStr.length() - 1; i++) {
            int num = Integer.parseInt(numStr.substring(i, i + 2));  // Get two consecutive digits
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = sumOfConsecutiveDigits(num);
        System.out.println("Sum of numbers formed by consecutive digits: " + result);
    }
}

