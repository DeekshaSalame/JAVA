public class Ques23a {
    public static void main(String[] args) {
        int num = 1;  // Start number
        
        // Loop for 3 rows
        for (int i = 1; i <= 3; i++) {
            // Print numbers for each row
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(num + " ");
                num++;  // Increment number after printing
            }
            System.out.println();  // Move to next row
        }
    }
}
