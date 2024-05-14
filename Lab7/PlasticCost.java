import java.util.Scanner;
class TwoD 
{
    double length, breadth;

    TwoD(double l, double b) 
    {
        length = l;
        breadth = b;
    }

    double area() 
{
        return length * breadth;
    }
}

class ThreeD extends TwoD 
{
    double height;

    ThreeD(double l, double b, double h)
    {
        super(l, b);
        height = h;
    }

    double volume() 
    {
        return length * breadth * height;
    }
}

public class PlasticCost 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length and breadth of the plastic sheet: ");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        TwoD twoD = new TwoD(length, breadth);
        System.out.print("Enter the length, breadth, and height of the plastic box: ");
        length = scanner.nextDouble();
        breadth = scanner.nextDouble();
        double height = scanner.nextDouble();
        ThreeD threeD = new ThreeD(length, breadth, height);
        double costOfSheet = twoD.area() * 40;
        double costOfBox = threeD.volume() * 60;
        double totalCost = costOfSheet + costOfBox;
        System.out.println("Cost of the plastic sheet: Rs " + costOfSheet);
        System.out.println("Cost of the plastic box: Rs " + costOfBox);
        System.out.println("Total cost of the plastic: Rs " + totalCost);
        scanner.close();
    }
}