// Custom Exception class
class ArithmeticCustomException extends Exception {
    public ArithmeticCustomException(String message) {
        super(message);
    }
}

public class ArithmeticExceptionHandler {

    public static double calculate(String equation) throws ArithmeticCustomException {
        try {
            String[] parts = equation.split("/");
            double numerator = Double.parseDouble(parts[0]);
            double denominator = Double.parseDouble(parts[1]);

            if (denominator == 0) {
                throw new ArithmeticCustomException("Denominator cannot be zero.");
            }
            return numerator / denominator;
        } catch (NumberFormatException e) {
            throw new ArithmeticCustomException("Invalid number format in equation.");
        }
    }

    public static void main(String[] args) {
        try {
            String equation = "10/0"; // Example of division by zero
            double result = calculate(equation);
            System.out.println("Result: " + result);
        } catch (ArithmeticCustomException e) {
            System.out.println(e.getMessage());
        }
    }
}

