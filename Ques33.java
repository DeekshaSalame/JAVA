import java.util.Scanner;

// Class Commission
class Commission {
    // Instance variable
    private double sales;

    // Constructor
    public Commission(double sales) {
        this.sales = sales;
    }

    // Method to calculate the commission
    public double commission() {
        // Assuming a flat commission rate of 10%
        return sales * 0.10;
    }
}

// Demo class to test the Commission class
public class Ques33{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the sales amount from the user
        System.out.print("Enter the sales amount: ");
        double sales = scanner.nextDouble();

        // Validate the sales amount
        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            // Create a Commission object
            Commission commission = new Commission(sales);

            // Calculate and print the commission
            double commissionAmount = commission.commission();
            System.out.println("The commission is: " + commissionAmount);
        }

        scanner.close();
    }
}
