import java.util.*;
public class Sample3 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int Person_age;
        System.out.println("person_age");
        Person_age=in.nextInt();
        in.close();
        if(Person_age>18)
        {
            System.out.println("The person is eligible for vote");
        }
        else 
        {
            System.out.println("The person is not eligible for vote");
        }
    }
}
    

