
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sonu
 */

// reading file using Bufferedinputstream
import java.io.*;
//package filehandling;

/**
 *
 * @author Sonu
 */
public class demo {
    public static void main(String[] args) {
        try{
            FileInputStream fis= new FileInputStream("file.txt");
            BufferedInputStream bis =new BufferedInputStream(fis);
            int i;
            while((i=bis.read())!=-1){
                System.out.println((char)i);
            }
            fis.close();
            bis.close();
            
        }
        catch (FileNotFoundException e1){
            System.out.println("File isnot Found");
        }
        catch(Exception e2){
            System.out.println("Reading File Error");
        }
    }
    
}


