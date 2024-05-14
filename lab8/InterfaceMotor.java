interface Motor{
    int capacity = 50;
    void run();
    void consume();
}

class WashingMachine implements Motor{
    public void run(){
        System.out.println("Machine is running");
    }
    public void consume(){
        System.out.println("Interface data :" + capacity);
    }
}

public class InterfaceMotor {
        public static void main(String args[]){
        WashingMachine w1=new WashingMachine();
        w1.run();
        w1.consume();
    }
}