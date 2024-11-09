import java.util.Scanner;

// Custom exception for invalid username or password
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

public class UserAuthentication {

    public static void validateCredentials(String username, String password) throws InvalidCredentialsException {
        String correctPassword = "password123"; // Correct password for validation

        if (username.length() < 6) {
            throw new InvalidCredentialsException("Username must be at least 6 characters.");
        }

        if (!password.equals(correctPassword)) {
            throw new InvalidCredentialsException("Password does not match.");
        }

        System.out.println("Credentials are valid!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            validateCredentials(username, password);
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }
}

