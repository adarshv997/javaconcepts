package asd.t3;

import java.util.PriorityQueue;

public class mainqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer>q=new PriorityQueue<Integer>();//creating empty priority queue
        //add element to queue using add()
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        System.out.println(q.peek());//printing top element of priority queue
        System.out.println(q.poll());//printing top elemenet and remove it
        System.out.println(q.peek());//printing top elemenetagain

    }

    
}
