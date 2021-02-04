package asd.t3;
import java.io.File;
import java.io.IOException;
public class createfile {
    public static void main(String[] args) {
        try{
            File f=new File("test.txt");
            if(f.createNewFile()){
            System.out.println("File created"+f.getName());
            }
            else{
                System.out.println("file exists");
            }
            }
            catch(IOException e){
            System.out.println("error occurred");
            e.printStackTrace();
        }
        
        
    }
}
