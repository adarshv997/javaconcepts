package asd.t3;

public class mainthread extends Thread{
    public static void main(String[] args) {
        mainthread t=new mainthread();//object creation
        t.start();//calling start() method which executes a call to run( ) method.
        System.out.println("this code is out side thread");

    }
    public void run(){
        System.out.println("this code is running in thread");
    }
    

}
    

