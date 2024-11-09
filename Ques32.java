public class Ques32 {

    // Instance variables
    private String message;
    private int number;

    // Parameterized constructor
    public Ques32(String message, int number) {
        this.message = message;
        this.number = number;
    }

    // Method to display the message and number
    public void display() {
        System.out.println("Message: " + message);
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        Ques32 obj = new Ques32("Hello, Copilot!", 2024);
        // Displaying the message and number
        obj.display();
    }
}

    

