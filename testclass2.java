class geometry
{
    double area(double r)
    {
        return 3.14*r*r;
    }
    int area(int l, int b)
    {
        return l*b;
    }
    double area(double b, double h)
    {
        return 0.5 * b * h;
    }
}
class testclass2
{
    public static void main(String args[])
    {
        geometry a = new geometry();
        System.out.println("Area of Circle : " + a.area(4));
        System.out.println("Area of Rectangle : "+a.area(3,2));
        System.out.println("Area of Triangle : "+a.area(10.0,7.0));  
    }
}