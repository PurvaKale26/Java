import java.util.*;
public class Factorial{
   

    public static void main(String[] args){
System.out.println("enter no.");
        int n=new Scanner(System.in).nextInt();
         int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        
        }
        System.out.print("Factorial is:"+factorial);
    

    }
}