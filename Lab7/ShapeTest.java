class Shape 
{
    protected double area;

    public void showArea() 
    {
        System.out.println("Area of shape is: " + area);
    }
}

class Circle extends Shape 
{
    private double radius;

    public Circle(double r) 
    {
        radius = r;
        area = Math.PI * radius * radius;
    }

    public void showArea() 
    {
        System.out.println("Area of circle is: " + area);
    }
}

class Rectangle extends Shape 
{
    private double length, width;

    public Rectangle(double l, double w) 
    {
        length = l;
        width = w;
        area = length * width;
    }

    public void showArea() 
    {
        System.out.println("Area of rectangle is: " + area);
    }
}

public class ShapeTest 
{
    public static void main(String[] args) 
    {
        Circle c = new Circle(3.0);
        c.showArea();

        Rectangle r = new Rectangle(3.0, 4.0);
        r.showArea();
    }
}