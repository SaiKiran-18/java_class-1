public class Box {
    double length;
    double width;
    void getdata(double a,double b)
    {
        length=a;
        width=b;
    }
    public static void main(String args[]){
        double area;
        Box b1=new Box();
        b1.getdata(12.2,13.2);
        area=b1.length*b1.width;
        System.out.println("Area of the box is="+area);
    }
}
    
