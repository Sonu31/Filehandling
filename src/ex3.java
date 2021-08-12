/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
//import java.IOException;
import java.io.IOException;  
/**
 *
 * @author Sonu
 */
public class ex3 {
    public static void main(String[] args)
    throws IOException
    {
        int i;
        FileOutputStream fout= new FileOutputStream("d:/name1.text",false);
        String s= "TATA";
        char ch[]=s.toCharArray();
        for(i=0;i<s.length();i++)
            fout.write(ch[i]);
        fout.close();
        
    }
    
    
    
}
