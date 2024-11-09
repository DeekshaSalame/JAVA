import java.util.Scanner;

// Custom exception for TooHot temperature
class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

// Custom exception for TooCold temperature
class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class TemperatureCheck {

    // Method to check the temperature
    public static void checkTemperature(double temp) throws TooHot, TooCold {
        if (temp > 35) {
            throw new TooHot("Temperature is too hot!");
        } else if (temp < 5) {
            throw new TooCold("Temperature is too cold!");
        } else {
            System.out.println("Temperature is normal.");
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println("Converted to Fahrenheit: " + fahrenheit + "°F");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double temperature = sc.nextDouble();

        try {
            checkTemperature(temperature);
        } catch (TooHot | TooCold e) {
            System.out.println(e.getMessage());
        }
    }
}

