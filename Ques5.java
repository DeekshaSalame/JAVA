import java.util.Scanner;

public class Ques5 {
   public Ques5() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter distance in miles: ");
      double var2 = var1.nextDouble();
      double var4 = var2 * 1.60934;
      System.out.println("" + var2 + " miles is approximately " + var4 + " kilometers.");
      var1.close();
   }
}
    

