package practice;

import java.io.File;
import java.io.*;

public class CreateFile{
    public static void main(String[] args)throws IOException{
        try {
            File file = new File("C:\\Users\\user\\Desktop\\test.txt");
            if(file.createNewFile()){
                System.out.println("created successfully: " + file.getName());
            }
            else{
                System.out.println("file already exists: " + file.getName());
            }
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}