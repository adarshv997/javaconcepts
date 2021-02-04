package asd.t3;

public class excep {
   
    public static void main(String args[]) {
        int a[] = new int[2];
        try {//  Block of code to try
           System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {//  Block of code to handle errors
           System.out.println("Exception thrown  :" + e);
        }finally {
           a[0] = 6;
           System.out.println("First element value: " + a[0]);
           System.out.println("The finally statement is executed");
        }
     }
    
}
