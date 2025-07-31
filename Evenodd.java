import java.util.*;
public class Evenodd{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int sumE=0,sumO=0;
     System.out.println("Enter no. of elements you want to enter");
     int n=sc.nextInt();
     int[] arr=new int[n];
     System.out.println("enter elements");
     for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
    }
   for(int i=0;i<n;i++){
     if(arr[i]%2==0){
      sumE+=arr[i];
     }else{
      sumO+=arr[i];
}
}
System.out.println("sum of even no. :"+sumE);
System.out.println("sum of Odd no. :"+sumO);
}
}

       