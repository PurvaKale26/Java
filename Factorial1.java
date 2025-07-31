import java.util.*;
public class Factorial1{
public int fact(int n){
  int total=1;
  while(n>0){
    total=n*fact(n-1);
  
  
}
  return total;
}

public static void main(String args[]){
int num=new Scanner(System.in).nextInt();
 Factorial1 f=new Factorial1();
System.out.println("Factorial is:"+f.fact(num));
}
}

  
 