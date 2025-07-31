import java.util.*;

public class Conditional1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int button= sc.nextInt();

        switch(button)
        {
            case 1:System.out.print("Hello");
            break;
            case 2:System.out.print("Namaste");
            break;
            case 3:System.out.print("bonjour");
            break;
            default:
                System.out.print("invalid");
        }
    }

    
}