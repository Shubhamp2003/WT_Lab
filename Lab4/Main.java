// Program to print the corresponding grade for the given mark using if..else

import java.io.*;
import java.net.SocketPermission;
class Q1
{
    void check_grade(int mark){
        if(mark >= 90){
            System.out.println("Grade O");
        }
        else if(mark >= 80){
            System.out.println("Grade E");
        }
        else if(mark >= 70){
            System.out.println("Grade A");
        }
        else if(mark >= 60){
            System.out.println("Grade B");
        }
        else if(mark >= 50){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Grade D");
            
        }

    }
}
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the mark: ");
        int mark = Integer.parseInt(br.readLine());
        Q1 g = new Q1();
        g.check_grade(mark);
    }
}