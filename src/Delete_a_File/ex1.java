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
public class ex1 {
    
    public static void main(String[] args) {
        File f1= new File ("d:fileh/ex6.text");
        f1.delete();
        System.out.println("successfully delete");
        
    }
    
}
