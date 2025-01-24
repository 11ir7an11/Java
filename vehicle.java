import util.java.Scanner;
import java.io.*;
public class vehicle {

    string color;
    int speed;
    vehicle(String color, int speed)
    {
        this.color=color;
        this.speed=speed;
    }
    void display()
    {
        System.out.println("Color : "+color);
        System.out.println("Speed : "+speed);
    }
}
class car extends vehicle{
    int modelNo;
    car(String color, int speed, int modelNo)
    {
        super(color,speed);
        this.modelNo=modelNo;
    }
    void displayModel()
    {
        System.out.println("Model No : "+modelNo);
    }
}

class motorcycle extends vehicle{
    int modelNo;
    motorcycle(String color, int speed, int modelNo)
    {
        super(color,speed);
        this.modelNo = modelNo;
    }
    void displayModel()
    {
        System.out.println("Model No : "+modelNo);
    }
}
class testclass
{
    public static void main(String args[])
    {
        car c = new car("White",70,60);
        c.displayModel();
        c.display();
        motorcycle mc = new motorcycle("Green",45,80);
        mc.displayModel();
        mc.display();
    }
}
