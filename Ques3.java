import java.util.Scanner;

public class Ques3 {
   public Ques3() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the first number:");
      double var2 = var1.nextDouble();
      System.out.print("Enter the second number:");
      double var4 = var1.nextDouble();
      System.out.print("Enter the third number:");
      double var6 = var1.nextDouble();
      double var8 = Math.max(Math.max(var2, var4), var6);
      System.out.println("the maximum of the three number is:" + var8);
      var1.close();
   }
}


