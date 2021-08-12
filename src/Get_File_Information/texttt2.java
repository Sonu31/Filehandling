/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Sonu
 */
public class texttt2 {
    public static void main(String[] args) {
        File f1= new File("d:/naeefdfme1.text");
        f1.createNewFile();
        System.out.println("exists="+f1.exists());
        System.out.println("can file read"+f1.canWrite());
        System.out.println("is file exist "+f1.exists());
        System.out.println("File name-"+f1.getName());
        System.out.println("Length of file "+f1.length());
        //f1.delete();
    }
    
    
}
