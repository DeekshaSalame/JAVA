import java.util.Scanner;

public class Ques4{
   public Ques4() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      double var2 = var1.nextDouble();
      System.out.print("Enter the second number: ");
      double var4 = var1.nextDouble();
      System.out.println("Before swapping:");
      System.out.println("First number: " + var2);
      System.out.println("Second number: " + var4);
      System.out.println("After swapping:");
      System.out.println("First number: " + var4);
      System.out.println("Second number: " + var2);
      var1.close();
   }
}

    

