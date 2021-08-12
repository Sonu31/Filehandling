

import java.io.*;
import java.io.IOException;

public class ex4 {
    public static void main(String[] args) {
        try{
            File f1= new  File (" d:/Fileh/ex52.text");
            
            if(f1.createNewFile()) 
            {
                System.out.println("File"+f1.getName()+"is create successful");
            }
            else
            {
                System.out.println("File id already exist in the directory ");
            }
           }
        catch (IOException exception )
        {
            System.out.println("An unexpected error is occurred ");
            exception.printStackTrace();
        }}
    }
