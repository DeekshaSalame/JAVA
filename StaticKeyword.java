class Counter {
    static int count = 0;  // Static variable

    // Static method
    public static void increment() {
        count++;
    }

    public static void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        // Increment count using static method
        Counter.increment();
        Counter.increment();

        // Display the count using static method
        Counter.displayCount();  // Output: Count: 2
    }
}

