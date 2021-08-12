/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */import java.io.*;
package Delete_a_File;

/**
 *
 * @author Sonu
 */
public class Text3 {
    public static void main(String[] args)
    throus 
    {
       try{
           File f1=new File("d:fileh/ex6.text");
           if(f1.delete())
           {
               System.out.println("your file is successFully delete");
           }
           else
           {
               System.out.println("your File is already delete");
           }
       }
       catch(IOException exception){
           System.out.println("unexcepated");
           exception.printStackTrace();
           // exception.printStackTrace();
        
       }
    }
    
}
