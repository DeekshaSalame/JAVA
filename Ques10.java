import java.util.*;

public class Ques10 {
    public static void main(String[] args){

        int term, a=0, b=1, c;
        System.out.print("Enter trem");
        Scanner r=new Scanner(System.in);
        term=r.nextInt();
        for(int i=1;i<=term;i++){

            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    } 
}
