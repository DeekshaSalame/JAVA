import java.util.Scanner;

public class Ques21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Convert binary to decimal
        System.out.print("Enter a binary number: ");
        String binaryStr = scanner.nextLine();
        int decimal = Integer.parseInt(binaryStr, 2);
        System.out.println("Decimal equivalent: " + decimal);

        // Convert decimal to binary
        System.out.print("Enter a decimal number: ");
        int decimalNum = scanner.nextInt();
        String binary = Integer.toBinaryString(decimalNum);
        System.out.println("Binary equivalent: " + binary);

        scanner.close();
    }
}

    


