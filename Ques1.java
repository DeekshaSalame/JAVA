import java.util.Scanner;

public class Ques1 {
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.println("Fahrenheit to celsius (1) or Celsius to Fahrenheit (2)");
        int result = scan.nextInt();

        if (result == 1){

            System.out.println("You have chosen FAHRENHEIT to CELSIUS!");
            System.out.println("Enter fahrenheit value:");
            double value = scan.nextDouble();
            double valueFinal = (value -32)*5/9;
            System.out.print("Celsius is:");
            System.out.println(Math.round(valueFinal*10.0)/10.0);

        }else if (result ==2){
            System.out.println("You have chosen CELSIUS to FAHRENHEIT!");
            System.out.println("Enter Celsius value:");
            double value = scan.nextDouble();
            double finalResult = value* 1.8+32;
            System.out.print("Fahrenheit is:");
            System.out.println(Math.round(finalResult*10.0)/10.0);



        }else {
            System.out.println("Not a valid choice!");
    
        }
    }
}
