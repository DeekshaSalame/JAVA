import java.util.Scanner;

// Custom exception for TooOlder
class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}

// Custom exception for TooYounger
class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class EmployeeRecruitment {

    // Method to check eligibility based on age
    public static void checkEligibility(String name, int age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder("Age is too old for recruitment.");
        } else if (age < 20) {
            throw new TooYounger("Age is too young for recruitment.");
        } else {
            System.out.println("Eligible candidate: " + name);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter candidate name: ");
        String name = sc.nextLine();

        System.out.print("Enter candidate age: ");
        int age = sc.nextInt();

        try {
            checkEligibility(name, age);
        } catch (TooOlder | TooYounger e) {
            System.out.println(e.getMessage());
        }
    }
}

