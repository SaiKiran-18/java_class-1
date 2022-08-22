/*The following program is about casting(converting one type to another) */

class Testwrap{
    public static void main(String args[]){
        int i=25;
        float f=54.56f;
        char c='x';
        long l=34567890L;
        short s1=10;
        System.out.println("Before casting");
        System.out.println("i="+i);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("s1="+s1);
        System.out.println("c="+c);
        System.out.println("After casting");
        int j=(int)l;
        int k=(int)s1;
        double d=(double)f;
        int p=(char)c;
        System.out.println("(int)l="+j);
        System.out.println("(int)s1="+k);
        System.out.println("(double)f="+d);
        System.out.println("(char)c="+p);
        

    }
}