/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
package Delete_a_File;

/**
 *
 * @author Sonu
 */
public class exx2 {
    public static void main(String[] args) {
        
        File f1= new File ("d:fileh/ex6.text");
        if(f1.delete())
        {
            System.out.println("Your File is successfully delete");
        }
        else
        {
            System.out.println("Your already File is delete");
        }
    }
    
}
