import java.util.*;
public class Sample2 {
    int number;
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=in.nextInt();
    
    if(number>-128 && number<128)
    {
        System.out.println("The entered number is byte");

    }
    else if(number>3.4e-038 && number<1.7e+0.38)
    {
        System.out.println("The entered number is float");
    }
    else 
    {
        System.out.println("The entered number is neither byte nor float");

    }
    in.close();
}
}

