package WT_Lab.Lab10;

import java.io.*;


public class q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String str1 = br.readLine();
        String temp = "";
        for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            if(Character.isUpperCase(ch))
                temp += Character.toLowerCase(ch);
            else
                temp += Character.toUpperCase(ch);
        }
        System.out.println("The changed case of string is: " + temp);

        System.out.print("Enter another string: ");
        String str2 = br.readLine();
        String str2Reversed = "";
        for (int i = str2.length() - 1; i >= 0; i--) {
            str2Reversed += str2.charAt(i);
        }
        System.out.println("Reversed string: " + str2Reversed);

        System.out.print("Enter a string to compare: ");
        String str3 = br.readLine();
        System.out.print("Enter another string to compare: ");
        String str4 = br.readLine();
        if (str3.equals(str4)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        System.out.print("Enter a string: ");
        String str5 = br.readLine();
        System.out.print("Enter another string to concatenate: ");
        String str6 = br.readLine();
        String concatenatedString = str5.concat(str6);
        System.out.println("Concatenated string: " + concatenatedString);
    }
}
