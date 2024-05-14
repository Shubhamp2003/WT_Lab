package General;

public class Employee {
    protected int  empid;
    private String ename;
    public double basic,earnings;
    public Employee(int e, String s1,double b){
        basic=b;
        empid=e;
        ename=s1;
    } 
    public void  earnings(){
        earnings = basic+(0.8*basic)+(0.15*basic);
    }
}