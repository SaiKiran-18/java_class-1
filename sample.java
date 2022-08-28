import java.util.*;
public class sample {

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=in.nextInt();
        if(n%2!=0)
        {
            System.out.println("weird");
        }
    else if(n%2==0 && 2<n<5)
    {
        System.out.println("Not weird");
        else if(n%2==0 && 6<n<20)
        {
            System.out.println("weird");
;        }
    }
    else if(n%2==0 && n>20)
    {
        System.out.println("Not weird");
    }    
    }
    
}
