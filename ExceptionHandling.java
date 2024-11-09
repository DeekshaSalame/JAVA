class ExceptionHandlingDemo {
    
    // Method that throws an exception
    public static void methodThatThrows() throws ArithmeticException {
        throw new ArithmeticException("ArithmeticException thrown");
    }

        
    public static void main(String[] args) {
        try {
            // Try block to test exception handling
            System.out.println("Inside try block");
            methodThatThrows(); // This will throw an exception
        } catch (ArithmeticException e) {
            // Catch block to handle the exception
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            // Finally block always executes
            System.out.println("This is the finally block.");
        }

        try {
            // Another block to throw a different exception
            throw new NullPointerException("NullPointerException thrown");
        } catch (NullPointerException e) {
            // Catch block for different exception type
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Final block after second exception.");
        }
    }
    }

