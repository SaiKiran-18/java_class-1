import java.util.*;
public class Student {
    int sno,m1,m2,m3,total;
    String sname,Result;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student name");
        sname=sc.nextLine();
        System.out.println("Enter student number");
        sno=sc.nextInt();
        System.out.println("Enter student marks-1");
        m1=sc.nextInt();
        System.out.println("Enter student marks-2");
        m2=sc.nextInt();
        System.out.println("Enter student marks-3");
        m3=sc.nextInt();

        System.out.println("Total marks");
        total=m1+m2+m3;
        sc.close();
        if(m1>=35 && m2>=35 && m3>=35)
        Result="pass";
        else 
        Result="fail";
    }
    void putdata(){
        System.out.println("Student details are");
        System.out.println("Student name="+sname);
        System.out.println("Student number="+sno);
        System.out.println("Student marks-1 "+m1);
        System.out.println("Student marks-2 "+m2);
        System.out.println("Student marks-3 "+m3);
        System.out.println("Total marks="+total);
        System.out.println("Result="+Result);
    }
}
class Test{
    public static void main(String args[]){
        Student st=new Student();
        st.getdata();
        st.putdata();
    }
}

