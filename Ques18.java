import java.util.Scanner;

 public class Ques18{ 
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in); 
          System.out.print("Enter an integer: "); 
          int number = scanner.nextInt();

          int count = 0; 
          int temp = Math.abs(number);
          do { count++; temp /= 10;
         } 
         while (temp != 0);
          System.out.println("The number of digits in " + number + " is: " + count);
           scanner.close(); }
         }
    

