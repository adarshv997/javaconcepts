package asd.t3;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException; //io exception for handle error
import java.util.Scanner;
public class mainwritefile {
    public static void main(String[] args) {
        try {
          FileWriter myWriter = new FileWriter("test3.txt");
          myWriter.write("market simplified");
          myWriter.close();
          System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
      }
    }
    
