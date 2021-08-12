




import java.io.*;

public class All_File_class_method {
    public static void main(String[] args) {
        File f1 = new File ("d:/fileh/FileoperationEx.text") ;
        
        f1.createNewFile();
            System.out.println("The name of the file is :"+f1.getName());
            System.out.println("the absolure path of the file is "+f1.getAbsolutePath());
            System.out.println("it file writeable "+f1.canWrite());
            System.out.println("is file readable "+f1.canRead());
            System.out.println("The size of the file in bytes is "+f1.length());
            
            
            
        }
        
        }
        
    }
    
    
}
