/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */import java.io.*;
package Create_a_File;

/**
 *
 * @author Sonu
 */
public class exx1 {
    public static void main(String[] args) {
        File f1=  new File("d:fileh/d21.txt");
        f1.createNewFile();
        System.out.println("exists="+f1.exists());
        
    }
    
}
