public class MethodOverloading {

    // Method with no parameters
    public void display() {
        System.out.println("Display method with no parameters");
    }

    // Method with one parameter
    public void display(int number) {
        System.out.println("Display method with one parameter: " + number);
    }

    // Method with two parameters
    public void display(int number, String message) {
        System.out.println("Display method with two parameters: " + number + ", " + message);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        // Calling the display method with different parameters
        obj.display();
        obj.display(10);
        obj.display(20, "Hello");
    }
}

    

