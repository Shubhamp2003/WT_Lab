import java.io.*;

class Palindrome{
    int num;
    int checkPalindrome()throws IOException{
        DataInputStream ds=new DataInputStream(System.in);
        System.out.println("Enter the number:");
        num = Integer.nextInt(System.in);
        int temp = num;
        int t1=0,t2;
        while(temp!=0){
            t2 = temp % 10;
            t1 = t1*10 + t2;
            temp= temp/10;
        }
        if(t1==num){
            return num;
        }
        else{
            return -1;
        }
    }
}
class Main{
    public static void main(String[] args)throws IOException{
        int res;
        Palindrome p=new Palindrome();
        res=p.checkPalindrome();
        if(res==-1){
            System.out.println("Not palindrome");
        }
        else{
            System.out.println(" palindrome");
        }
    }
}