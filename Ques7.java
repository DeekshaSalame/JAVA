import java.util.Scanner;

public class Ques7 {
   public Ques7() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the five subject marks:");
      int var2 = var1.nextInt();
      int var3 = var1.nextInt();
      int var4 = var1.nextInt();
      int var5 = var1.nextInt();
      int var6 = var1.nextInt();
      int var7 = var2 + var3 + var4 + var5 + var6;
      float var8 = (float)(var7 / 5);
      System.out.println("Total :" + var7);
      System.out.println("Percentage:" + var8);
      if (var8 >= 90.0F) {
         System.out.println("Grade A");
      } else if (var8 >= 80.0F) {
         System.out.println("Grade B");
      } else if (var8 >= 70.0F) {
         System.out.println("Grade C");
      } else if (var8 >= 60.0F) {
         System.out.println("Grade D");
      } else if (var8 >= 40.0F) {
         System.out.println("Grade E");
      } else {
         System.out.println("Grade F");
      }

   }
}

    

