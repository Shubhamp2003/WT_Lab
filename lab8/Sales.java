package Marketing;
import General.Employee;

public class Sales extends Employee{
    public Sales(int e, String s1,double b){
        super( e, s1,b);
    }
    double travelallowance;
    public void tallowance(){
        travelallowance = earnings *0.5;
    }
    public void display(){
        System.out.println("The empid is :"+empid);
        System.out.println("Earnings of the employee is :"+earnings);
        System.out.println("Travel Allowance of the employee is :"+travelallowance);
    }
}