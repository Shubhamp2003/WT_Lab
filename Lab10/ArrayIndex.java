// Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using catch statement
package WT_Lab.Lab10;

import java.util.*;
public class ArrayIndex {
    public  static void main(String []args) {
        
    Scanner sc= new Scanner (System.in);
    int arrr[]= new int[3];
    arrr[0]=23;
    arrr[1]=32;
    arrr[2]=45;
    try{
        System.out.print("Enetr the array index:");
        int n=sc.nextInt();
        System.out.print("value"+arrr[n]);
    }
    catch(ArrayIndexOutOfBoundsException A ){
        System.out.print(A);
    }
    catch(Exception E){
       System.out.print(E);
    }
    }
}