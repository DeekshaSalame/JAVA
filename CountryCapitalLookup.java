import java.util.Scanner;

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class CountryCapitalLookup {

    public static void findCapital(String country) throws NoMatchFoundException {
        switch (country.toLowerCase()) {
            case "india":
                System.out.println("Capital of India is New Delhi");
                break;
            case "usa":
                System.out.println("Capital of USA is Washington, D.C.");
                break;
            case "japan":
                System.out.println("Capital of Japan is Tokyo");
                break;
            default:
                throw new NoMatchFoundException("No match found for the country: " + country);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter country name: ");
        String country = sc.nextLine();

        try {
            findCapital(country);
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

