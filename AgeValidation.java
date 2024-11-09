import java.util.Scanner;

// Custom exception for negative age
class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class AgeValidation {

    public static void checkAge(int age) throws NegativeAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative.");
        }
        System.out.println("Age entered: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

