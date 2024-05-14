package WT_Lab.Lab10;

class Parent {
    int x;

    Parent(int m) {
        x = m;
    }
}

class Child extends Parent {
    int y;

    Child(int a, int b) {
        super(a);
        y = b;
    }

    void display() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

public class q1 {
    public static void main(String[] args) {
        Child c = new Child(10, 20);
        c.display();
    }
}
