abstract class Student{
    int rollno;
    int regno;
    abstract void course();
}

class Kiitian extends Student{
    String course;
    Kiitian(int r, int reg, String c){
        rollno=r;
        reg=regno;
        course=c;
    }
    void course(){  
        System.out.println("Roll no "+rollno+" took "+course+" course");
    }
}

public class AbstractStudent {
    public static void main(String args[]){
        Kiitian k1=new Kiitian(21052951, 10012345, "WT");
        k1.course();
    }
}