class Plate 
{
    double length, width;

    Plate(double l, double w) 
    {
        length = l;
        width = w;
        System.out.println("Constructing Plate");
    }

    double area() 
    {
        return length * width;
    }
}

class Box extends Plate 
{
    double height;

    Box(double l, double w, double h) 
    {
        super(l, w);
        height = h;
        System.out.println("Constructing Box");
    }

    double volume() {
        return length * width * height;
    }
}

class WoodBox extends Box 
{
    double thickness;

    WoodBox(double l, double w, double h, double t) 
    {
        super(l, w, h);
        thickness = t;
        System.out.println("Constructing WoodBox");
    }

    double weight() 
    {
        return length * width * height * thickness * 0.2;
    }
}

public class MultiLevelInheritance 
{
    public static void main(String[] args)
    {
        WoodBox woodBox = new WoodBox(10, 5, 2, 1);
        System.out.println("Area of plate: " + woodBox.area());
        System.out.println("Volume of box: " + woodBox.volume());
        System.out.println("Weight of wood box: " + woodBox.weight());
    }
}