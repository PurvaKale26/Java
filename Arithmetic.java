import java.util.*;
public class Arithmetic{
public static void main(String args[]){
int a,b,result;
Scanner sc=new Scanner(System.in);
System.out.println("enter two no.s");
a=sc.nextInt();
b=sc.nextInt();
result=a+b;
System.out.println("Addition is:"+result);
result=a-b;
System.out.println("Substraction is:"+result);
result=a*b;
System.out.println("Multiplication is:"+result);
result=a/b;
System.out.println("Division is:"+result);
}
}
