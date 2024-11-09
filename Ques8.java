import java.util.*;

public class Ques8 {
    public static void main(String[] args){

        int n;
        System.out.print("Enter any number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if(n%5==0){
            System.out.print("Divisible by 5");
        }
        else{
            System.out.print("Not Divisible by 5");
        }

    }
    
}
