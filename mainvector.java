package asd.t3;
import java.io.*; 
import java.util.*; 
import java.util.Vector;

public class mainvector {
    public static void main(String[] args) {
        //Declare vector
        Vector<Integer> v=new Vector<Integer>();
        //appendung new element
        for(int i=0;i<10;i++)
            v.add(i);
        System.out.println(v);
        v.remove(3);
        System.out.println(v);
        for(int i=0; i<v.size();i++)
            System.out.println(v.get(i));


    }
    
}
