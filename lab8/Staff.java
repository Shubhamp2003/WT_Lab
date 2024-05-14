interface Mainclass{
    void earnings();
    void deductions();
    void bonus();
}
abstract class Manager implements Mainclass{
    double earnings,deductions,basic;
    public void earnings(){
        earnings = basic+(0.8*basic)+(0.15*basic);
        System.out.println("The earnings of the employee is " + earnings);
    } 
    public void deductions(){
        deductions = 0.12*basic;
        System.out.println("The deductions of the employee is " + deductions);
    }
}
class Substaff extends Manager{
    double bonus, total;
    Substaff(int b){
        basic=b;
    }   
     public void bonus(){
        bonus = 0.5*basic;
        System.out.println("The bonus of the employee is " + bonus);
    }
    void totalSal(){
        total = earnings-deductions+bonus;
        System.out.println("The total salary of the employee is " + total);
    }   
}
public class Staff {
    public static void main(String args[]){
        Substaff s1= new Substaff(100000);
        s1.earnings();
        s1.deductions();
        s1.bonus();
        s1.totalSal();
    }    
}