class A{
    public String add;
    public String getAddress(){
        return add;
    }
    public void setAddress(String N){
        this.add = N;
    }
}

class HomeAddress extends A{
    public String getAddress(){
        return add;
    }
    public void setAddress(String N){
        this.add = N;
    }
}
class OfficeAddrress extends A{
    public String getAddress(){
        return add;
    }
    public void setAddress(String N){
        this.add = N;
    }
}
class SchoolAddress extends A{
    public String getAddress(){
        return add;
    }
    public void setAddress(String N){
        this.add = N;
    }
}

public class Address {
    public static void main(String[] args){
        A[] a = new A[3];
        A a[0] = new HomeAddress();
        a[0].setAddress("HomeAddress");
        a[0].getAddress();
        A a[1] = new OfficeAddrress();
        a[1].setAddress("OfficeAddress");
        a[1].getAddress();
        A a[2] = new SchoolAddress();
        a[2].setAddress("SchoolAddress");
        a[2].getAddress();
    }
}
