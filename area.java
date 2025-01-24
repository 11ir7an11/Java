class geometry
{
    int area(int r)
    {
        return 3.14*r*r;
    }
    int area(int l, int b)
    {
        return l*b;
    }
    float area(float b, float h)
    {
        return (1/2) *b * h;
    }
}
class testclass2
{
    public static void main(String args[])
    {
        geometry a = new geometry();
        System.out.println("Area of Circle : " + a.area(4));
        System.out.println("Area of Rectangle : "+a.area(3,2));
        System.out.println("Area of Rectangle : "+a.area(2.3,4.2));
    }
}