import java.io.*;
package Create_a_File;

/**
 *
 * @author Sonu
 */
public class ex2 {
    public static void main(String[] args) {
        File f1=new File ("d:fileh/ex4.text");
        if(f1.createNewFile())
        {
            System.out.println("file is  succesful create");
        }
        else
        {
            System.out.println("file is not createad");
        }
    }
    
}
