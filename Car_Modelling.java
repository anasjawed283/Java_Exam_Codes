import java.util.*;
class Car
{
    Scanner sob=new Scanner(System.in);
    String colour,name,manufacturer;
    double mileage;
    int yearmodel;
    Car()
    {
        colour="*";
        name="*";
        manufacturer="* ";
        mileage=0.0;
        yearmodel=0;
    }
    public void readCar()
    {
        colour=sob.next();
        name=sob.next();
        manufacturer=sob.next();
        mileage=sob.nextDouble();
        yearmodel=sob.nextInt();
    }
    public void setCar(String a, String b, String c ,double d ,int e)
    {
        colour=a;
        name=b;
        manufacturer=c;
        mileage=d;
        yearmodel=e;
    }
    public void printCar()
    {
        System.out.println("Colour: "+colour);
        System.out.println("Name: "+name);
        System.out.println("Manufacturer: "+manufacturer);
        System.out.println("Mileage: "+mileage);
        System.out.println("Yearmodel: "+yearmodel);
    }
}

public class Main
{
    public static void main(String...args)
    {
       Car c1=new Car();
       Car c2=new Car();
       Car c3=new Car();
       c1.readCar();
       c1.printCar();
       c2.setCar("Black","i10","Hyundai",20.36,2012);
       c2.printCar();
       c3.printCar();
    }
}
