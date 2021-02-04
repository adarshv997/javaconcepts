package asd.t3;

import java.util.Iterator;
import java.util.Stack;

public class mainstack {
    public static void main(String[] args) {
        Stack<String> s=new Stack<String>();
        s.push("Adarsh");
        s.push("Kholi");
        s.push("msd");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        //iterator for the stack
        Iterator<String>i=s.iterator();
        //printing stack
        while(i.hasNext()){  //hasNext() checks and returns true if it has another non-whitespace character
            System.out.println(i.next()+" ");

        }


    }
    
}
