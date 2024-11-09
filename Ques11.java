import java.util.*;

public class Ques11 {
    public static void main(String[] args){

        int n,r;
        System.out.print("Enter any number");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();

        while(n>0){
            r=n%10;
            System.out.print("Reverse Order"+r);
            n=n/10;
        }
    }
    
}
