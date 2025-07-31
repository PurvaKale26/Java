import java.util.*;

public class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two no.s");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("Enter your choice : + , -, *, /");
        String ch=sc.next();
        int c;
        switch(ch){
            case "+":c=a+b;
                     System.out.print("Result:"+c);
                     break;

             case "-":c=a-b;
                     System.out.print("Result:"+c);
                     break;

            case "*":c=a*b;
                     System.out.print("Result:"+c);
                     break;

            case "/":c=a/b;
                     System.out.print("Result:"+c);
                     break;         

             default:
                System.out.print("invalid");                         
        }
    }

}