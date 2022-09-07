import java.util.*;
class Sample4{
    public static void main(String args[]){
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of a person");
        age=sc.nextInt();
        sc.close();
        try{
        if(age<18)
        {
            throw new ArithmeticException("Access denied");
        }
        else{
            System.out.println("Access granted");
        }
    }
    catch(ArithmeticException e)
    {
        System.out.println("Something wents wrong");
    }

    }
}
