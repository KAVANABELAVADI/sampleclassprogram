class Car
{
    void print()
    {
        System.out.println("Car name is Maruthi");
    }
}

abstract class Color
{
    abstract void paint();
}
class Red extends Color
{
    void paint()
    {
        System.out.println("Red color Car");
    }
}
class White extends Color
{
    void paint()
    {
        System.out.println("White color Car");
    }
}

public class SampleClassProgram
{
    public static void main(String args[])
    {
        Car car=new Car();
        car.print();
        Color color=new White();
        color.paint();
    }
}