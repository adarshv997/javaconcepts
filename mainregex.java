package asd.t3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mainregex {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("adarsh",Pattern.CASE_INSENSITIVE);//pattern creation
        Matcher m=p.matcher("I am adarsh");//matcher() method is used to search pattern in a string
        boolean mf= m.find();
        if(mf){
            System.out.println("match found");
        }
        else{
            System.out.println("match not found");
        }
    }
    
}
