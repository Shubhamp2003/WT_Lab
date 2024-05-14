class ACCOUNT{
    int acc_no;
    float balance;
    ACCOUNT( int n,float b){
    acc_no=n;
    balance=b;
}
    void displayDetails(){
        System.out.println("Account no : "+acc_no);
        System.out.println("balance : "+balance);
    }
}

class Person extends ACCOUNT{
    String name;
    int aadhar_no;
    Person(String a,int c,int n, float b){
        super(n,b);
        name=a;
        aadhar_no=c;
    }
    void displayDetails(){
        System.out.println("Account no : "+acc_no);
        System.out.println("balance : "+balance);
        System.out.println("Name : "+name);
        System.out.println("Aadhar No:"+aadhar_no);
    }
}
public class ACCOUNTMAIN {
    public static void main(String args[]){
        Person p1=new Person("Shubham",123, 2951, 500000);
        p1.displayDetails();
    }
}