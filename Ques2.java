import java.util.Scanner;

public class Ques2 {
   public Ques2() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a number: ");
      double var2 = var1.nextDouble();
      if (var2 > 0.0) {
         System.out.println("The number is positive.");
      } else if (var2 < 0.0) {
         System.out.println("The number is negative.");
      } else {
         System.out.println("The number is zero.");
      }

      var1.close();
   }
}
    

