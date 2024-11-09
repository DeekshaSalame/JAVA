public class ExceptionGeneration {

    public static void main(String[] args) {
        try {
            // Generate NegativeArrayIndexException
            int[] arr = new int[5];
            System.out.println(arr[-1]);  // Accessing invalid index
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
        }

        try {
            // Generate ArithmeticException
            int result = 10 / 0;  // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e);
        }
    }
}

