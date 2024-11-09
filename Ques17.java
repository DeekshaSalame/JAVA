import java.util.*;

public class Ques17 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = 0;

        for(int i=1; i<=b; i++){
            if(a%i==0 && b%i==0) 
            temp = i;
        }
       
        System.out.println(temp);
        int lcm = a*b/temp;
        System.out.println(lcm);
        
    }
    
}
    

