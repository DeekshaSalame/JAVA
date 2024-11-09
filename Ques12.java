import java.util.*;

public class Ques12 {
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter marks in mathematics:");
    int m = in.nextInt();
    System.out.print("Enter marks in physics:");
    int p = in.nextInt();
    System.out.print("Enter marks in chemistry:");
    int c = in.nextInt();
    int t = m+p+c;
    int mp = m+p;

    if(m>=60 && p>=50 && c>=40 && (t>=200 || mp>=150))
    System.out.println("Eligible");
    else
    System.out.println("Not Eligible");
    } 
}
    

