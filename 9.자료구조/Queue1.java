import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

    //큐 구현

    public static void main(String[] args) {
//        Queue<Integer> queue =new LinkedList<Integer>();
//        queue.offer(1);
//        System.out.println(queue);

        Array_Queue array_queue = new Array_Queue(5);
        array_queue.offer(1);
        array_queue.offer(2);
        array_queue.offer(3);
        array_queue.offer(4);
        array_queue.pop();
        array_queue.offer(5);
        array_queue.offer(6);
        array_queue.pop();
        System.out.println(array_queue.peek());
    }
}

class Array_Queue {

    private int size;
    private int[] q;
    private int front; //앞
    private int rear; //뒤
    private int cap;

    public Array_Queue(int size) {

        this.size = size;
        this.front =0;
        this.rear=0;
        this.cap = size;
        this.q = new int[size];
    }


    public void offer(int x) {

        if(IsFull()) {
            System.out.println("overflow");
            System.exit(-1);
        }
        q[rear] = x;
        rear +=1;
        cap +=1;

        if(rear == size) {
            rear =0;
        }
    }

    public void pop() {
        if(IsEmpty()) {
            System.out.println("underflow");
            System.exit(-1);
        }
        q[front]=0;
        front +=1;
        cap-=1;

        if(front == size) {
            front=0;
        }
    }

    public int peek() {
        if(IsEmpty()) {
            System.out.println("underflow");
            System.exit(-1);
        }
        return q[front];
    }


    public boolean IsEmpty() {
        return cap==0;
    }
    public boolean IsFull() {
        return rear == size;
    }


}
