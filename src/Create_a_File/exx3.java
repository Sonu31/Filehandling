/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.io.IOException;
package Create_a_File;

/**
 *
 * @author Sonu
 */
public class exx3 {
    public static void main(String[] args) {
      
        try{
              File f1= new File("d:fileh/ex6.text");
            if(f1.createNewFile()){
                
                System.out.println("you file is create sucessfully "+f1.getName());
            }
            else{
                System.out.println("File is already created" );
            }
        }
            catch(IOException exception){
                    System.out.println("unexpated error ");
                    exception.printStackTrace();
                    
                    
            }
    }
    
}
