import java.util.Scanner;
class Box
{
    int l,b,h,v;
    Box(int l,int b,int h)
    {
        this.l = 10;
        this.b = 20;
        this.h = 15;
    }
    public int volume()
    {
        v = l*b*h;
        return v;
    }
}
public class volume2
{
    public static void main(String args[])
    {
        Box b1=new Box(10,20,30);
        Box b2=new Box(40,50,60);
        System.out.println("Volume of the box 1 is : " +b1.volume());
        System.out.println("Volume of the box 2 is : "+b2.volume());
    }
}